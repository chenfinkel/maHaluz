package sample;


import java.util.List;

public class Course {
    private List<StudyGroup> Lectures;
    private List<StudyGroup> Practice;
    private List<StudyGroup> Laboratories;

    public Course(List<StudyGroup> lectures, List<StudyGroup> practice, List<StudyGroup> laboratories) {
        Lectures = lectures;
        Practice = practice;
        Laboratories = laboratories;
    }
    public List<StudyGroup> getLectures() {
        return Lectures;
    }

    public void setLectures(List<StudyGroup> lectures) {
        Lectures = lectures;
    }

    public List<StudyGroup> getPractice() {
        return Practice;
    }

    public void setPractice(List<StudyGroup> practice) {
        Practice = practice;
    }

    public List<StudyGroup> getLaboratories() {
        return Laboratories;
    }

    public void setLaboratories(List<StudyGroup> laboratories) {
        Laboratories = laboratories;
    }


}


