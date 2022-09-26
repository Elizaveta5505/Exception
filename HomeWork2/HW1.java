package JavaCrash.Exception.HomeWork2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        try {
            getFloat();
            System.out.println(getFloat());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введите значение типа float");

        }

    }

    public static Float getFloat() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        Float floaat = in.nextFloat();

        in.close();

        return floaat;
    }
}
