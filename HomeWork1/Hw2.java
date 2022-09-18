package JavaCrash.Exception.HomeWork1;

import java.util.Arrays;

public class Hw2 {
    public static void main(String[] arr) {
        int[] firstArr = new int[] { 14, 3, 8, 9 };
        int[] secondArr = new int[] { 10, 6, 15 };
        System.out.println(Arrays.toString(fillArray(firstArr, secondArr)));
    }

    public static int[] fillArray(int[] array, int[] arr) {
        int[] thirdArr = new int[array.length];
        try {
            for (int i = 0; i < thirdArr.length; i++) {
                thirdArr[i] = array[i] - arr[i];
            }
        } catch (RuntimeException e) {
            System.out.println("Длина массивов отличается");
        }
        return thirdArr;
    }
}
