import java.lang.Math;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String details[];
            String Subject_E[];
            String Subject_S[];
            String Subject_M[];
            String line = br.readLine();

            while (line != null) {

                details = line.split(",");

                line = br.readLine();
                Subject_E = line.split(" ");

                Student s_E = new Student(details[0].trim(), details[1].trim(), Subject_E[0].trim());
                System.out.println(s_E.getfName() + " " + s_E.getlName() + " " + s_E.getCourse());

                English en1 = new English(Integer.parseInt(Subject_E[1].trim()), Integer.parseInt(Subject_E[2].trim()),
                        Integer.parseInt(Subject_E[3].trim()));

                for (int i = 1; i < 10; i++) {
                    System.out.println(Subject_E[i]);
                }

                line = br.readLine();
                Subject_S = line.split(" ");

                Student s_S = new Student(details[0].trim(), details[1].trim(), Subject_S[0].trim());
                Science sc1 = new Science(Integer.parseInt(Subject_S[1].trim()), Integer.parseInt(Subject_S[2].trim()),
                        Integer.parseInt(Subject_S[3].trim()), Integer.parseInt(Subject_S[4].trim()));

                for (int i = 1; i < 10; i++) {
                    System.out.println(Subject_S[i]);
                }

                line = br.readLine();
                Subject_M = line.split(" ");

                Student s_M = new Student(details[0].trim(), details[1].trim(), Subject_M[0].trim());
                Math m1 = new Math(Integer.parseInt(Subject_M[1].trim()), Integer.parseInt(Subject_M[2].trim()),
                        Integer.parseInt(Subject_M[3].trim()), Integer.parseInt(Subject_M[4].trim()),
                        Integer.parseInt(Subject_M[5].trim()), Integer.parseInt(Subject_M[6].trim()),
                        Integer.parseInt(Subject_M[7].trim()), Integer.parseInt(Subject_M[8].trim()));

                for (int i = 1; i < 10; i++) {
                    System.out.println(Subject_M[i]);
                }

                line = br.readLine();

            }

            br.close();
        } catch (IOException e1) {
            System.out.println("Error in File reading!!!");
        } catch (Exception e2) {
            System.out.println("Error in processing!!!");
        }

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