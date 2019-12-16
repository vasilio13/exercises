import java.io.*;

/**ЗАДАЧА №950

 Сжатие бинарных последовательностей
 (Время: 1 сек. Память: 16 Мб Сложность: 19%)

 Последовательность из символов «0» и «1» называется бинарной. Они широко применяются в информатике и других науках. Одно из неудобств бинарных последовательностей – их трудно запоминать. Для решения этой проблемы были предложены разные способы их сжатия. Программист Слава использует следующий способ: просматривая последовательность слева направо, он заменяет «1» на «a», «01» на «b», «001» на «c», …, «00000000000000000000000001» на «z». Напишите программу, которая поможет Славе автоматизировать этот способ сжатия.
 Входные данные

 Входной файл INPUT.TXT содержит бинарную последовательность – строку из символов «0» и «1» длиной не более 255 символов. Гарантируется, что к ней применим указанный способ сжатия.
 Выходные данные

 В выходной файл OUTPUT.TXT выведите одну строку из английских строчных букв от «a» до «z» – сжатие заданной бинарной последовательности.
 Примеры
 №	INPUT.TXT	OUTPUT.TXT
 1	101	ab
 2	101001	abc
 3	0000000000000000000000001	y */

public class Binar {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))) {
            String s = new String(bufferedReader.readLine());
            System.out.println(s);
            String s1 = new String("");
            int position = 0;
            char temp = 1;
            int numberChar=0;
            System.out.println(s.length());
            System.out.println((char)121);
            for(int count=0;count<s.length();count++){
                System.out.println("numberChar "+" count "+count+" position "+position);
                if ((s.charAt(count))==(49)) {
                    numberChar = count-position;// 97 - 122
                    s1 = s1+ Character.toString((char)(97+numberChar));
                            position = count+1;
                }
               // System.out.println(97+numberChar);
                }

            System.out.println(" result" + s1);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
            bufferedWriter.write(s1);
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
