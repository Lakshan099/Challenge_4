import java.lang.Math;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[256];
        String[] subArray_E = new String[256];
        String[] subArray_S = new String[256];
        String[] subArray_M = new String[256];

        ReadData("test.txt", strArray, ",");
        ReadDataSub_E("test.txt", subArray_E, " ");

        Student s_E = new Student(strArray[0].trim(), strArray[1].trim(), subArray_E[0].trim());
        English en1 = new English(Integer.parseInt(subArray_E[1].trim()), Integer.parseInt(subArray_E[2].trim()),
                Integer.parseInt(subArray_E[3].trim()));

        ReadDataSub_S("test.txt", subArray_S, " ");

        Student s_S = new Student(strArray[0].trim(), strArray[1].trim(), subArray_S[0].trim());
        Science sc1 = new Science(Integer.parseInt(subArray_S[1].trim()), Integer.parseInt(subArray_S[2].trim()),
                Integer.parseInt(subArray_S[3].trim()), Integer.parseInt(subArray_S[4].trim()));

        ReadDataSub_M("test.txt", subArray_M, " ");

        Student s_M = new Student(strArray[0].trim(), strArray[1].trim(),
                subArray_M[0].trim());
        Maths m1 = new Maths(Integer.parseInt(subArray_M[1].trim()),
                Integer.parseInt(subArray_M[2].trim()),
                Integer.parseInt(subArray_M[3].trim()), 
                Integer.parseInt(subArray_M[4].trim()),
                Integer.parseInt(subArray_M[5].trim()),
                Integer.parseInt(subArray_M[6].trim()),
                Integer.parseInt(subArray_M[7].trim()),
                Integer.parseInt(subArray_M[8].trim()));

        System.out.println(en1.avgMark());

    }

    static void ReadData(String txtFile, String details[], String split) {

        try {
            FileReader fr = new FileReader(txtFile);
            BufferedReader br = new BufferedReader(fr);
            String details1[];
            String line = br.readLine();
            int i = 0;

            while (line != null) {

                details1 = line.split(split);
                details[i] = details1[i].trim();
                details[i + 1] = details1[i + 1].trim();
                line = br.readLine();
                i++;
                // System.out.println(i);
            }

            br.close();
        } catch (IOException e1) {
            System.out.println("Error in File reading!!!");
        } catch (Exception e2) {

        }

    }

    static void ReadDataSub_E(String txtFile, String details[], String split) {

        try {
            FileReader fr = new FileReader(txtFile);
            BufferedReader br = new BufferedReader(fr);
            String details1[];
            String line = br.readLine();

            while (line != null) {

                line = br.readLine();
                details1 = line.split(split);
                for (int y = 0; y < 10; y++) {
                    details[y] = details1[y].trim();
                }

            }

            br.close();
        } catch (IOException e1) {
            System.out.println("Error in File reading!!!");
        } catch (Exception e2) {

        }

    }

    static void ReadDataSub_S(String txtFile, String details[], String split) {

        try {
            FileReader fr = new FileReader(txtFile);
            BufferedReader br = new BufferedReader(fr);
            String details1[];
            String line = br.readLine();

            while (line != null) {

                line = br.readLine();
                line = br.readLine();
                details1 = line.split(split);
                for (int y = 0; y < 10; y++) {
                    details[y] = details1[y].trim();
                }

            }

            br.close();
        } catch (IOException e1) {
            System.out.println("Error in File reading!!!");
        } catch (Exception e2) {

        }

    }

    static void ReadDataSub_M(String txtFile, String details[], String split) {

        try {
            FileReader fr = new FileReader(txtFile);
            BufferedReader br = new BufferedReader(fr);
            String details1[];
            String line = br.readLine();

            while (line != null) {

                line = br.readLine();
                line = br.readLine();
                line = br.readLine();
                details1 = line.split(split);
                for (int y = 0; y < 10; y++) {
                    details[y] = details1[y].trim();
                }

            }

            br.close();
        } catch (IOException e1) {
            System.out.println("Error in File reading!!!");
        } catch (Exception e2) {

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