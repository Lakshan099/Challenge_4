public class Science {
    
    private int Attendance;
    private int Project;
    private int Midterm;
    private int FinalExam;

    public Science(int Attendance, int Project, int Midterm, int FinalExam) {
        this.Attendance = Attendance;
        this.Project = Project;
        this.Midterm = Midterm;
        this.FinalExam = FinalExam;
    }

    public int totalMark() {

        int total = Attendance + Project + Midterm + FinalExam;

        return total;
    }

    
}
