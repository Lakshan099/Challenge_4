public class Maths {

    private int quiz_1;
    private int quiz_2;
    private int quiz_3;
    private int quiz_4;
    private int quiz_5;

    private int test_1;
    private int test_2;
    private int FinalExam;

    public Maths(int quiz_1, int quiz_2, int quiz_3, int quiz_4, int quiz_5, int test_1, int test_2, int FinalExam) {
        this.quiz_1 = quiz_1;
        this.quiz_2 = quiz_2;
        this.quiz_3 = quiz_3;
        this.quiz_4 = quiz_4;
        this.quiz_5 = quiz_5;
        this.test_1 = test_1;
        this.test_2 = test_2;
        this.FinalExam = FinalExam;
    }

    public double totalMark() {

        double total = (((quiz_1 + quiz_2 + quiz_3 + quiz_4 + quiz_5) / 5) * 0.15) + (test_1 * 0.3) + (test_2 * 0.2)
                + (FinalExam * 0.35);

        return total;
    }

}
