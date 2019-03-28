package sample;

import java.util.ArrayList;
import java.util.List;

public class mySchedulingAlgorithm implements IScheduleAlgorithm{

    private StudyGroup[][] timeTable;
    private List<Course> courses;

    public mySchedulingAlgorithm(List<Course> courses){
        this.courses = courses;
        timeTable = new StudyGroup[14][6];
    }

    public Course[][] build() {

    }

    private  recBuild(int course, int lecture, int practice, StudyGroup[][] table){
        if (!canBePlaced(courses.get(course).getLectures().get(lecture),table))


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
    private List<Course> options;
    public List<Course> buildPer(List<Course> permotation, int options)
    {
        if (options == 0)
            return permotation;
                

    }
}
