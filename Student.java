public class Student {
    private String fName;
    private String lName;
    private String course;

    public Student(String fName, String lName, String course) {
        this.fName = fName;
        this.lName = lName;
        this.course = course;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }      

}
