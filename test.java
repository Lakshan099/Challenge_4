import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) {

        String[] strArray = new String[256];
        String[] subArray_E = new String[256];
        String[] subArray_S = new String[256];
        String[] subArray_M = new String[256];

        ReadData("test.txt", strArray, ",");

        for (int i = 0; i < 2; i++) {
            System.out.println(strArray[i]);
        }

        ReadDataSub_E("test.txt", subArray_E, " ");

        for (int i = 0; i < 10; i++) {
            System.out.println(subArray_E[i]);
        }

        ReadDataSub_S("test.txt", subArray_S, " ");

        for (int i = 0; i < 10; i++) {
            System.out.println(subArray_S[i]);
        }

        ReadDataSub_M("test.txt", subArray_M, " ");

        for (int i = 0; i < 10; i++) {
            System.out.println(subArray_M[i]);
        }

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
            System.out.println("Error in processing!!!");
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
                for(int y=0; y<10; y++){
                    details[y] = details1[y].trim();
                }
                
            }

            br.close();
        } catch (IOException e1) {
            System.out.println("Error in File reading!!!");
        } catch (Exception e2) {
            System.out.println("Error in processing!!!");
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
            System.out.println("Error in processing!!!");
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
            System.out.println("Error in processing!!!");
        }

    }

}