package sample;

import java.util.ArrayList;
import java.util.List;

public class mySchedulingAlgorithm implements IScheduleAlgorithm{

    private StudyGroup[][] timeTable;
    private List<Course> courses;

    private CourseOption[][] permotations;
    private List<CourseOption[]> allOptions;

    public void recCreatePermotations(List<Integer> courseIndex)
    {
        boolean isFinish = true;
        for (Integer i: courseIndex){
            if (i != permotations.length-1)
            {
                isFinish = false;
                break;
            }
        }
        if (isFinish)
        {
            CourseOption[] courseOptions = new  CourseOption[courseIndex.size()];
            for (int i=0; i<courseIndex.size(); i++)
            {
                courseOptions[i]=permotations[courseIndex.get(i)][i];
            }
            allOptions.add(courseOptions);
            return;
        }
        CourseOption[] courseOptions = new  CourseOption[courseIndex.size()];
        for (int i=0; i<courseIndex.size(); i++)
        {
            courseOptions[i]=permotations[courseIndex.get(i)][i];
        }
        allOptions.add(courseOptions);
        courseIndex = updateIndex(courseIndex, courseIndex.size()-1);
        recCreatePermotations(courseIndex);
    }

    private List<Integer> updateIndex(List<Integer> courseIndex, int index)
    {
        if (courseIndex.get(index) == permotations.length-1)
        {
            courseIndex.set(index, 0);
            return updateIndex(courseIndex, index-1 );
        }
        courseIndex.set(index, courseIndex.get(index)+1);
        return courseIndex;
    }

    public mySchedulingAlgorithm(List<Course> courses){
        this.courses = courses;
        timeTable = new StudyGroup[14][6];
    }

    public Course[][] build() {
        return null;
    }

    private void recBuild(int course, int lecture, int practice, StudyGroup[][] table){
        if (!canBePlaced(courses.get(course).getLectures().get(lecture),table))
            ;

    }

    private boolean canBePlaced(StudyGroup sg, StudyGroup[][] table){
        int day = sg.getDateDetails().day;
        int startTime = sg.getDateDetails().startTime;
        for(int i = 0; i < sg.getDateDetails().duration; i++){
            if (table[startTime+i][day] != null && !table[startTime+i][day].equals(sg))
                return false;
        }
        return true;
    }
}