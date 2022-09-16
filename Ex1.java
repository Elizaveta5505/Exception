package JavaCrash.Exception;
public class Ex1 {
    private static final int MIN_ARRAY_LENGTH = 3;

    public static void main (String[] args) {
        int[] arr = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        int value = 5;
        System.out.println(searchValue(arr, value));


    }

    public static boolean getArrayLength(int[] array) {
        if (array.length >= MIN_ARRAY_LENGTH) return true;
        return false;
    }

    public static int searchValue(int[] args, int val) {
        if (args == null) return -3;
        if (!getArrayLength(args)) return - 1;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == val) {
                return i;
            }
        }
        return - 2;
    }
}
