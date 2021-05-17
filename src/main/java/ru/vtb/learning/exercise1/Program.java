package ru.vtb.learning.exercise1;

public class Program {
    public static void main(String[] args) {

        String[][] arr = new String[4][4];
        System.out.println("check 4*4");
        CheckerManager.Do(arr);
        System.out.println("---------------");

        String[][] arr2 = new String[4][5];
        try {
            System.out.println("check 4*5");
            CheckerManager.Do(arr2);
        }
        catch (MyArraySizeException e){
            // плохо, что метод отправляет запись на консоль не синхронно
            // можно как-то это сделать синхронно, чтобы красиво было?
            e.printStackTrace();
        }

        System.out.println("---------------");

        String[][] arr3 = new String[5][4];
        try {
            System.out.println("check 5*4");
            CheckerManager.Do(arr2);

        }
        catch (MyArraySizeException e){
            e.printStackTrace();
        }
        System.out.println("---------------");

        String[][] arr4 = new String[4][4];
        try {
            System.out.println("check 4*4 with change size");
            arr4[3] = new String[6];
            CheckerManager.Do(arr2);
        }
        catch (MyArraySizeException e){
            e.printStackTrace();
        }
        System.out.println("---------------");
    }
}
