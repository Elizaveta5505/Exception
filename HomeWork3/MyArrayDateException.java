package JavaCrash.Exception.HomeWork3;

public class MyArrayDateException extends RuntimeException{
    public MyArrayDateException(String message) {
        super ("В массиве найдены не только числа");
    }
}
