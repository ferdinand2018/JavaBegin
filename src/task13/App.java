package task13;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1е выражение");
        String s1 = in.nextLine();
        System.out.println("Введите 2е выражение");
        String s2 = in.nextLine();
        int a = s1.length();
        int b = s2.length();
        System.out.println("Длина 1й строки: " + a + "\n" + "Длина 2й строки: " + b + "\n");
        if(a > b){
            System.out.println("Наибольшая строка: " + s1);
        }
        else if(b > a){
            System.out.println("Наибольшая строка: " + s2);
        }
        else{
            System.out.println("Длины строк равны");
        }
    }
}
