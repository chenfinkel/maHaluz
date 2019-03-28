package sample;

import java.util.ArrayList;
import java.util.List;

public class TimeTableBuilder {

    private IScheduleAlgorithm sa;
    private List<Course> myCourses;


    public TimeTableBuilder(IScheduleAlgorithm sa){
        this.sa = sa;
        myCourses = new ArrayList<>();
    }

    public Course[][] build(){
        return sa.build(myCourses);
    }

    public void addCourse(Course c){
        if (c != null)
            myCourses.add(c);
    }

}
