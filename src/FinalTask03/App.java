package FinalTask03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс: ");
        BigDecimal k = in.nextBigDecimal();
        System.out.println("Введите Введите сумму (в рублях): ");
        BigDecimal r = in.nextBigDecimal();
        BigDecimal d = r.divide(k, 2, RoundingMode.CEILING);
        System.out.println("Сумма (в долларах): " + d);
    }
}
