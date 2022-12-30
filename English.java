public class English {

    private int TermPaper;
    private int Midterm;
    private int FinalExam;

    public English(int TermPaper, int Midterm, int FinalExam) {
        this.TermPaper = TermPaper;
        this.Midterm = Midterm;
        this.FinalExam = FinalExam;
    }

    public double totalMark() {

        double total = (TermPaper * 0.3) + (Midterm * 0.3) + (FinalExam * 0.4);

        return total;
    }

    public double avgMark() {

        double avg = (TermPaper + Midterm + FinalExam) / 3;

        return avg;
    }

}
