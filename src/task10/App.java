package task10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int arr1[] = new int[5];

        System.out.println("Введите элемент массива: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Введите элемент строки " + i);
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Исходный массив: \n");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nПолученный массив: \n");
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] * 3 + " ");
            }
            System.out.println();
        }
    }
}
