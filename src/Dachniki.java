import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

public class Dachniki { //https://acmp.ru/index.asp?main=task&id_task=12


    public static void main(String[] args) {
        // Read data класс дата метод считывания первой строки
        //читаем перую строку, устанавливаем цикл и счетчик
        //запускаем цикл с указанным значением
        //цикл: считываем строку
        //калькуляция
        //по результату вычисления счетчик
        Dachniki Test = new Dachniki();
        Test.readData();
        Integer[][] dd = new Integer[][];
        int quantityDachnik = 0;
        for (int i:
         dd[i][]) {

        }
        boolean r = Test.includeIN()

    }

    public Array[][] readData() {
        try {
            BufferedReader reader = new BufferedReader((new FileReader("/home/uzver/input.txt")));

            int quantity = Integer.parseInt(reader.readLine());
            //quantity = 3;
            System.out.println("Количество дачников: " + quantity);
            Integer dd[][] = new Integer[10][quantity];
            for (int j = 0; j < quantity; j++) {
                String s = reader.readLine();
                String[] temp = s.split(" ");
                System.out.println("/n");

                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " " + j + " " + temp[i]);
                    dd[i][j] = Integer.parseInt(temp[i]);
                }
            }
            return dd[][];

        } catch (FileNotFoundException e) {
            System.out.println("Error. File not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    boolean includeIN(int x, int y, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        int p1 = product(x, y, x1, y1, x2, y2);
        int p2 = product(x, y, x2, y2, x3, y3);
        int p3 = product(x, y, x3, y3, x4, y4);
        int p4 = product(x, y, x4, y4, x1, y1);

        if ((p1 < 0 && p2 < 0 && p3 < 0 && p4 < 0) ||
                (p1 > 0 && p2 > 0 && p3 > 0 && p4 > 0)) {
            return true;
        } else {
            return false;
        }

    }

    int product(int Px, int Py, int Ax, int Ay, int Bx, int By) {
        return (Bx - Ax) * (Py - Ay) - (By - Ay) * (Px - Ax);
    }
}




