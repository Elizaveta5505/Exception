package JavaCrash.Exception.HomeWork1;

import java.util.Arrays;

public class Hw3 {
    public static void main(String[] arr) {
        int[] firstArr = new int[] { 14, 6, 8, 9 };
        int[] secondArr = new int[] { 7, 3, 2 };
        System.out.println(Arrays.toString(fillArray(firstArr, secondArr)));
    }

    public static int[] fillArray(int[] array, int[] arr) {
        int[] thirdArr = new int[array.length];
        try {
            for (int i = 0; i < thirdArr.length; i++) {
                thirdArr[i] = array[i] / arr[i];
            }
        } catch (RuntimeException e) {
            System.out.println("Длина массивов отличается");
        }
        return thirdArr;
    }
    
}
