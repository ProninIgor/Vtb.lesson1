package ru.vtb.learning.exercise2;

public class IntParseResult {
    private boolean succeed;
    private int value;


    private IntParseResult(boolean succeed, int value) {
        this.succeed = succeed;
        this.value = value;
    }

    public static IntParseResult GetSucceedResult(int value){
        return new IntParseResult(true, value);
    }

    public static IntParseResult GetFailedResult(){
        return new IntParseResult(false, 0);
    }

    public boolean isSucceed() {
        return succeed;
    }

    public int getValue() {
        if (succeed) {
            return value;
        } else {
            throw new RuntimeException("Value is parse with error");
        }
    }
}
