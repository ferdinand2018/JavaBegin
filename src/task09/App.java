package task09;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Введите элемент массива: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Массив, введённый вами: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println("\nПолученный массив: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i] * 2 + " ");
        }
    }
}
