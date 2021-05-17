package ru.vtb.learning.exercise1;

public class CheckerManager {
    public static void Do(String[][] array){

        //тут надо бы по другому как-то обработать, но главное что мы ловим исключительный случай
        if (array == null) {
            throw new NullPointerException();
        }

        if(array.length != 4) {
            throw new MyArraySizeException();
        }

        for (String[] strings : array) {

            if (strings == null) {
                throw new NullPointerException();
            }

            if (strings.length != 4) {
                throw new MyArraySizeException();
            }
        }
    }
}
