package ru.vtb.learning.exercise1;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Array size not 4*4");
    }
}
