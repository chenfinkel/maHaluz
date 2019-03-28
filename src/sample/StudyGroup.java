package sample;

public class StudyGroup {
    public enum studyGroup{
        Lectures,
        Practice,
        Laboratories
    }

    private studyGroup studyGroup;
    private String teacherName;
    private classDate dateDetails;
    private location locationOfClass;

    public StudyGroup(String teacherName, classDate dateDetails, location locationOfClass, studyGroup studyGroupOfClass) {
        this.teacherName = teacherName;
        this.dateDetails = dateDetails;
        this.locationOfClass = locationOfClass;
        this.studyGroup=studyGroupOfClass;
    }

    public StudyGroup.studyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup.studyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public classDate getDateDetails() {
        return dateDetails;
    }

    public void setDateDetails(classDate dateDetails) {
        this.dateDetails = dateDetails;
    }

    public location getLocationOfClass() {
        return locationOfClass;
    }

    public void setLocationOfClass(location locationOfClass) {
        this.locationOfClass = locationOfClass;
    }



    public class classDate{

        public int day;
        public int startTime;
        public int duration;

        public classDate(int day, int startTime, int duration) {
            this.day = day;
            this.startTime = startTime;
            this.duration = duration;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getDuration() {
            return duration;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }


    }
    public class location{

        public int buildingNum;
        public int classNum;

        public location(int buildingNum, int classNum) {
            this.buildingNum = buildingNum;
            this.classNum = classNum;
        }

        public int getBuildingNum() {
            return buildingNum;
        }

        public void setBuildingNum(int buildingNum) {
            this.buildingNum = buildingNum;
        }

        public int getClassNum() {
            return classNum;
        }

        public void setClassNum(int classNum) {
            this.classNum = classNum;
        }
    }





}
