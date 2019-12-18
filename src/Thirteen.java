import java.io.*;

public class Thirteen {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))) {
            String s = bufferedReader.readLine();
            System.out.println(s);
            String[] ss = s.split(" ");
            System.out.println(ss[0]);
            System.out.println(ss[1]);
            int bull=0;
            int cow=0;
            char[] ss0 = ss[0].toCharArray();
            char[] ss1 = ss[1].toCharArray();
            if (ss0[0]==ss1[0]) {bull++;ss0[0]='b';ss1[0]='b';}
            if (ss0[1]==ss1[1]) {bull++;ss0[1]='b';ss1[1]='b';}
            if (ss0[2]==ss1[2]) {bull++;ss0[2]='b';ss1[2]='b';}
            if (ss0[3]==ss1[3]) {bull++;ss0[3]='b';ss1[3]='b';}

            for(int i0=0;i0<4;i0++) {
                if (ss0[i0]!='b') {
                    for (int i1=0;i1<4;i1++) {
                        if (ss1[i1]!='b') {
                            if (ss0[i0]==ss1[i1]) cow++;
                        }
                    }
                }
            }

            System.out.println("bull="+bull);
            System.out.println("cow="+cow);
            String sout = ""+bull+" "+cow;
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
            bufferedWriter.write(sout);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}