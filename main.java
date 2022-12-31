import java.lang.Math;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        

    }

    static double calAvg(int totalMark, int subcount) {

        double avg = totalMark / subcount;

        return Math.round(avg * 10) / 10.0;

    }

    static String findGrade(int totalMark) {
        if (totalMark > 90) {
            return "A";
        } else if (totalMark > 80 && totalMark < 89) {
            return "B";
        } else if (totalMark > 70 && totalMark < 79) {
            return "C";
        } else if (totalMark > 60 && totalMark < 69) {
            return "S";
        } else {
            return "F";
        }
    }

    static void findGradeCount(String grade) {
        int A_count = 0, B_count = 0, C_count = 0, S_count = 0, F_count = 0;

        switch (grade) {
            case "A":
                A_count++;
            case "B":
                B_count++;
            case "C":
                C_count++;
            case "S":
                S_count++;
            case "F":
                F_count++;
            default:
                System.out.println("Invalid Input");
        }

        System.out.println("A's" + A_count);
        System.out.println("B's" + B_count);
        System.out.println("C's" + C_count);
        System.out.println("S's" + S_count);
        System.out.println("F's" + F_count);

    }

}