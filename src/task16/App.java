package task16;

import java.io.*;

public class App {
    public static void main(String[] args) {
        String s;
        try(BufferedReader br = new BufferedReader(new FileReader("src/task16/sample.txt"))){
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        }catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
