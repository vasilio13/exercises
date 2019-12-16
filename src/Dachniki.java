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
ReadData Test = new ReadData();
Array[][] A = Test.rd();

        System.out.println("main");

    }
}

class Data {
    Integer[] box;
    int x, x1, x2, x3, x4, y, y1, y2, y3, y4;


    int product(int Px, int Py, int Ax, int Ay, int Bx, int By) {
        return (Bx - Ax) * (Py - Ay) - (By - Ay) * (Px - Ax);
    }

    boolean vhodit(int x, int x1, int x2, int x3, int x4, int y, int y1, int y2, int y3, int y4) {


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

}


class ReadData {
    public Integer[][] dachniki;

    Array[][] rd()

    {
        {
            try {
                BufferedReader reader = new BufferedReader((new FileReader("/home/uzver/input.txt")));

                int quantity = Integer.parseInt(reader.readLine());
                quantity = 3;
                System.out.println("Количество дачников: " + quantity);
                dachniki = new Integer[10][quantity];
                for (int j = 0; j < quantity-1; j++) {
                    String s = reader.readLine();
                    String[] temp = s.split(" ");
                    System.out.println(temp.length);
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i+" "+j+" "+temp[i]);
                        dachniki[i][j] = Integer.parseInt(temp[i]);
                    }
                }
               // return this.rd();
            } catch (FileNotFoundException e) {
                System.out.println("Error. File not Found");
            } catch (IOException e) {
                e.printStackTrace();
            }
/*
int[][] arr = {{1,2,3}, {0,0,0,}, {3,2,1}};
        for (int i[] : arr) { for (int j : i) System.out.print(j + " "); System.out.println(); }
 */
                return this.rd();

        }
    }
}