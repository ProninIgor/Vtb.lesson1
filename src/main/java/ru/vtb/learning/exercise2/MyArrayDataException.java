package ru.vtb.learning.exercise2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int rowIndex, int columnIndex, String value) {
        super(String.format("Cannot convert value to int (row: %d, column: %d, value: %s)", rowIndex, columnIndex, value));
    }
}
