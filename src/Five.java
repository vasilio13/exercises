import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("input.txt")) {
            Scanner reader = new Scanner(file);
            int sizeArr = reader.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < sizeArr; i++) {
                list.add(reader.nextInt());
            }

            ArrayList<Integer> listN = new ArrayList<>();
            ArrayList<Integer> listCH = new ArrayList<>();
            String s1 = "";
            String s2 = "";
            for (int i :
                    list) {

                if (i % 2 != 0) {
                    listN.add(i);
                } else listCH.add(i);

            }
            String s3 = "YES";
            if (listN.size() > listCH.size()) s3 = "NO";

            //System.out.println(i);
            System.out.println(s3);

            for (int li : listN) {
                s1 = s1 + li + " ";
            }
            System.out.println("s1= " + s1);


            for (int li : listCH) {
                s2 = s2 + li + " ";
            }
            System.out.println("s2= " + s2);


            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
            bufferedWriter.write(s1);
            bufferedWriter.newLine();
            bufferedWriter.write(s2);
            bufferedWriter.newLine();
            bufferedWriter.write(s3);

            bufferedWriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
