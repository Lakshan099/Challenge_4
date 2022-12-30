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

    public double totalMark() {

        double total = (Attendance * 0.1) + (Project * 0.3) + (Midterm * 0.3) + (FinalExam * 0.3);

        return total;
    }

    
}
