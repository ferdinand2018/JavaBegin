package FinalTask02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int x = in.nextInt();
        int arr[] = new int[x];

        System.out.println("Введите массив: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Введите элемент массива");
            arr[i] = in.nextInt();
        }

        System.out.println("Исходный массив: \n");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        bubbleSort(arr);

        System.out.println("\nОтсортированный массив: \n");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
