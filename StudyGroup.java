public class StudyGroup {
    private enum studyGroup{
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
        public String day;
        public String startTime;
        public String endTime;
        public classDate(String day, String startTime, String endTime) {
            this.day = day;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
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
