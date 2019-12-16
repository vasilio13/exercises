import java.io.*;

/**Входные данные

Входной файл INPUT.TXT содержит целое число K - номер лишней буквы, а затем через один или несколько пробелов записано слово S, состоящее из английских букв верхнего регистра. Гарантируется, что номер буквы не превышает длину слова. Длина слова не более 80 символов.
Выходные данные

В выходной файл OUTPUT.TXT выведите исправленное слово. */

public class Orfo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {

            String s;
            s = br.readLine();
            br.close();
            String[] s2 = s.split(" ",2);
            Integer number = Integer.parseInt(s2[0]);
            System.out.println(number);
            System.out.println(s2.length);
            StringBuffer word = new StringBuffer(s2[1]);
            System.out.println(word);
            StringBuffer w1 = new StringBuffer((word.toString()).trim());
            w1.delete(number-1,number);
            System.out.println(w1);
            BufferedWriter br1 = new BufferedWriter(new FileWriter("output.txt"));
            br1.write(String.valueOf(w1));
            br1.flush();
            br1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}