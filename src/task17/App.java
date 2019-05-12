package task17;

import java.io.*;

public class App {
    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите stop, чтобы закончить");
        try(FileWriter fw = new FileWriter("src/task17/test.txt")){
            do{
                System.out.println(": ");
                s = br.readLine();
                if (s.compareTo("stop") == 0) break;
                s = s + "\r\n";
                fw.write(s);
            } while (s.compareTo("stop") != 0);
        }catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
