package task14;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String S = in.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println("S: " + S);
        System.out.println("X: " + X);
        System.out.println("Y: " + Y);
    }
}
