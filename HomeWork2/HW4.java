package JavaCrash.Exception.HomeWork2;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите текст: ");
            String string = input.nextLine();
            string = string.trim();
            if(string.isEmpty())
                throw new IllegalArgumentException("Пустые строки вводить нельзя");
            else
                System.out.println(string);
        }
    }
}
