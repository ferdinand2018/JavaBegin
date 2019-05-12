package task12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите что-либо");
        String s = in.nextLine();
        System.out.println("Вы ввели: " + s);
        s = s.replaceAll("\\s+", "");
        System.out.println("Полученное выражение: " + s);
    }
}
