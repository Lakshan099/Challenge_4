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
        String[] grade = new String[256];

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

        System.out.println("Name: " + s_E.getfName() + " " + s_E.getlName());
        System.out.println("-------------------------------------------");   
        System.out.println(s_E.getCourse() + " Mark: " + en1.totalMark());
        System.out.println("Grade: " + findGrade(en1.totalMark()));
        System.out.println("-------------------------------------------");
        System.out.println(s_S.getCourse() + " Mark: " + sc1.totalMark());
        System.out.println("Grade: " + findGrade(sc1.totalMark()));
        System.out.println("-------------------------------------------");
        System.out.println(s_M.getCourse() + " Mark: " + m1.totalMark());
        System.out.println("Grade: " + findGrade(m1.totalMark()));
        System.out.println("-------------------------------------------");
        System.out.println("Final AVG: " + calAvg(en1.totalMark(), sc1.totalMark(), m1.totalMark()));

        storeGrade(grade,findGrade(en1.totalMark()),findGrade(sc1.totalMark()),findGrade(m1.totalMark()));

        System.out.println("-------------------------------------------");

        System.out.println("Grade Distribution ");

        findGradeCount(grade);



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

    static double calAvg(double sub1, double sub2, double sub3) {

        double avg = (sub1 + sub2 + sub3) / 3;

        return Math.round(avg * 100) / 100.0;

    }

    static String findGrade(double totalMark) {
        if (totalMark >= 90) {
            return "A";
        } else if (totalMark >= 80.0 && totalMark <= 89.0) {
            return "B";
        } else if (totalMark >= 70.0 && totalMark <= 79.0) {
            return "C";
        } else if (totalMark >= 60.0 && totalMark <= 69.0) {
            return "S";
        } else {
            return "F";
        }
    }

    static void storeGrade(String gradeList[], String sub1, String sub2, String sub3) {

        gradeList[0] = sub1;
        gradeList[1] = sub2;
        gradeList[2] = sub3;

    }

    static void findGradeCount(String grade[]) {
        int A_count = 0, B_count = 0, C_count = 0, S_count = 0, F_count = 0;

        for (int i = 0; i < 3; i++) {

            switch (grade[i]) {
                case "A":
                    A_count++;
                    break;
                case "B":
                    B_count++;
                    break;
                case "C":
                    C_count++;
                    break;
                case "S":
                    S_count++;
                    break;
                case "F":
                    F_count++;
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        }

        System.out.println("A's: " + A_count);
        System.out.println("B's: " + B_count);
        System.out.println("C's: " + C_count);
        System.out.println("S's: " + S_count);
        System.out.println("F's: " + F_count);

    }

}