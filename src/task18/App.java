package task18;

import java.io.*;

public class App {
    public static void main(String[] args) {
        //Выводим содержимое файла
        String s;
        try(BufferedReader br = new BufferedReader(new FileReader("src/task18/test.txt"))){
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        }catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        //Редактируем файл
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите stop, чтобы закончить");
        try(FileWriter fw = new FileWriter("src/task18/test.txt")){
            do{
                System.out.println(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        }catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
