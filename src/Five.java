import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;hg

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

            for (int i :
                    list) {

                if (i % 2 != 0) {
                    listN.add(i);
                } else listCH.add(i);
                String s3 ="YES";
                if (listN.size()>listCH.size()) s3="NO"; 

                System.out.println(i);

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
                for (int in:
                     ) {
                    
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
