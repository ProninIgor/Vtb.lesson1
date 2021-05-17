package ru.vtb.learning.exercise2;

public class CalculateManager {
    public static int Sum(String[][] array) {
        // доп проверку делать не будем, считаем, что массив уже проверили на необходимое соотвествие
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String value = array[i][j];
                IntParseResult intParseResult = MyIntParser.TryParse(value);

                if (intParseResult.isSucceed()) {
                    result += intParseResult.getValue();
                } else {
                    throw new MyArrayDataException(i, j, value);
                }
            }
        }

        return result;
    }

}

