package task06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1. Ввод трех чисел с клавиатуры X,Y,Z
        System.out.print("Введите 1е число: ");
        double X = in.nextInt();
        System.out.print("Введите 2е число: ");
        double Y = in.nextInt();
        System.out.print("Введите 3е число: ");
        double Z = in.nextInt();

        //2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z
        double s = (X + Y + Z) / 3;
        System.out.println("Среднее арифметическое: " + s);

        //3. Деление среднего арифметического на 2 без остатка
        int d = (int)s / 2;
        System.out.println("Деление среднего арифметического на 2 без остатка: " + d);

        //4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if(d > 3){
            System.out.println("Программа выполнена корректно");
        }
        else{
            System.out.println("Полученное число меньше 3");
        }
    }
}
