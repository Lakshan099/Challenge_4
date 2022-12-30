public class English {

    private int TermPaper;
    private int Midterm;
    private int FinalExam;

    public English(int TermPaper, int Midterm, int FinalExam) {
        this.TermPaper = TermPaper;
        this.Midterm = Midterm;
        this.FinalExam = FinalExam;
    }

    public int totalMark() {

        int total = TermPaper + Midterm + FinalExam;

        return total;
    }

    public double avgMark() {

        double avg = totalMark() / 3;

        return Math.round(avg * 10) / 10.0;
    }

    

}
