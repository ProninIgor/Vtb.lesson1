package ru.vtb.learning.exercise3;

import ru.vtb.learning.exercise1.CheckerManager;
import ru.vtb.learning.exercise1.MyArraySizeException;
import ru.vtb.learning.exercise2.CalculateManager;
import ru.vtb.learning.exercise2.MyArrayDataException;

public class Program {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        array[0] = new String[]{"2", "3", "4", "5"};
        array[1] = new String[]{"12", "13", "14", "15"};
        array[2] = new String[]{"22", "23", "24", "25"};
        array[3] = new String[]{"32", "33", "34", "35"};

        try {
            CheckerManager.Do(array);
            int sum = CalculateManager.Sum(array);
            System.out.println("Total sum: " + sum);
        }
        catch (NullPointerException e){
            System.out.println("Array is null or element of array is null");
        }
        catch (MyArraySizeException e){
            // тут можно объединить через |, но тогда другие Exception предлагает убрать, так как есть RuntimeException
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
