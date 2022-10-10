package JavaCrash.Exception.HomeWork3;

public class hw {
    public static void main(String[] args) {
        String[][] arrayy = {{"8", "8", "8", "8"}, {"1", "1", "1", "1"}};
        int result = arrayOut(arrayy);
        System.out.println(arrayy);

        try {
            result = 0;
            result = arrayOut(arrayy);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDateException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма элементов массива: " + String.valueOf(result));
            System.out.println();
        }
    }

    public static int arrayOut(String[][] array) throws MyArraySizeException, MyArrayDateException {
        int rows = array[0].length;
        int columns = array[1].length;
        if (rows !=4 || columns != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        int value = 0;

        for (int i = 1; i < 3; i++) {
            rows = i;
            for (int c = 1; c < 5; c++) {
                columns = c;
                try {
                    value = Integer.parseInt(array[i - 1][c - 1]);
                    sum += value;
                } catch (IllegalArgumentException e) {
                    String message = String.valueOf(rows) + "- ряд, " + String.valueOf(columns) + "- ячейка";
                    throw new MyArrayDateException(message);
                }
            }
        }
        return sum;
    }
}

