package task07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int T = in.nextInt();
        int X = 2;
        int Y = 12;
        int Z = 23;
        switch (T){
            case 2:
                System.out.println("Данное значение имеется в константах X");
                break;
            case 12:
                System.out.println("Данное значение имеется в константах Y");
                break;
            case 23:
                System.out.println("Данное значение имеется в константах Z");
                break;
            default:
                System.out.println("Такой константы нет!");
        }
    }
}
