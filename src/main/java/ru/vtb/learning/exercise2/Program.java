package ru.vtb.learning.exercise2;

public class Program {
    public static void main(String[] arg){
        String[][] arr = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = String.valueOf(i*j);
            }
        }
        int sum = CalculateManager.Sum(arr);
        System.out.println(sum);

        String[][] arr2 = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][j] = String.valueOf(i*j);
            }
        }

        arr2[2][2] = "F";
        int sum2 = CalculateManager.Sum(arr2);
        System.out.println(sum2);
    }
}
