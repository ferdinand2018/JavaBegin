package FinalTask01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        inputBinaryCount(in.nextLine());
    }
    static void inputBinaryCount(String A){
        String string  = new StringBuffer(A).reverse().toString();
        int count = 0;
        for(int i = string.length()-1; i>=0; i--){
            if(string.charAt(i) == '1'){
                count = count + binary(i);
            }
        }
        System.out.println("Число в int: " + count);
    }
    static int binary(int i){
        int count = 1;
        if( i == 0){
            count = 1;
        }else{
            for(int x = i; x > 0; x --){
                count *=2;
            }
        }
        return count;
    }
}
