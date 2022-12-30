import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {
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
}