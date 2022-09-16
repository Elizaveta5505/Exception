package JavaCrash.Exception;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main (String[] args) {
        // int[][] matrix = {{1,2,3,4},{4,3,2,1}};
       
        int sizeMatr = 5;
        System.out.println(initArray(sizeMatr));
}

    public static int[][] initArray (int size) {
        int[][] matrix = new int[size][size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rnd.nextInt(10);
            }
        }
        return matrix;
    }
}
