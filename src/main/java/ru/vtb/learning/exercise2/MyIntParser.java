package ru.vtb.learning.exercise2;

public class MyIntParser {
    public static IntParseResult TryParse(String s){
        try{
            int parseInt = Integer.parseInt(s);
            return IntParseResult.GetSucceedResult(parseInt);
        }
        catch (NumberFormatException e) {
            return IntParseResult.GetFailedResult();
        }
    }
}
