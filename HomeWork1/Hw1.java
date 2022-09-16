package JavaCrash.Exception.HomeWork1;

public class Hw1 { 
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // массив не инициализирован - NullPointerException 
            for (int j = 0; j < 5; j++) {      // здесь может быть обращение к элементу массива за его пределами - IndexOutOfВoundsException
                int val = Integer.parseInt(arr[i][j]); // попытка преобразования строки в числовой тип - NumberFormatException
                sum += val;
            }
        }
        return sum;
    }
}
