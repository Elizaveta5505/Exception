package JavaCrash.Exception;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main (String[] args) {
    Integer[] array = {1,null,3,4,null};
    checkArray(array);
  
}
    public static void checkArray(Integer[] arr){
        List<Integer> emptyValues = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                emptyValues.add(i);
            }
        }
        System.out.print("В этих индексах значения null" + emptyValues.toString());
    }
}
