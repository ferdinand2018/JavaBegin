package task18;

import java.io.*;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        //Выводим содержимое файла
        String s;
        int countS = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("src/task18/test.txt"))){
            while ((s = br.readLine()) != null){
                System.out.println(s);
                countS++;
            }
        }catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        System.out.println("Кол-во строк в исходном файле: " + countS);

        //Редактируем файл
        String str;
        int countStr = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Отредактируйте файл");
        try(FileWriter fw = new FileWriter("src/task18/test.txt")){
            do{
                System.out.print(": ");
                str = br.readLine();
                str = str + "\r\n";
                fw.write(str);
                countStr++;
            } while (countStr <= countS);
        }catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
