package ru.vtb.learning.exercise4;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        System.out.println("10 element");
        Test(Factory.Get(10));

        System.out.println("100 element");
        Test(Factory.Get(100));

        System.out.println("100000 element");
        Test(Factory.Get(100000));

        System.out.println("10000000 element");
        Test(Factory.Get(10000000));
    }

    private static void Test(TestItem item){
        List<String> elm1 = item.getElem1();
        int centerElm1 = elm1.size() / 2;
        List<String> elm2 = item.getElem2();
        int centerElm2 = elm2.size() / 2;

        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            elm1.get(centerElm1);
        }
        System.out.println("Time: for " + item.getElemMessage1()+ " - "+ (System.currentTimeMillis() - time));

        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            elm2.get(centerElm2);
        }
        System.out.println("Time: for " + item.getElemMessage2()+ " - " + (System.currentTimeMillis() - time2));


    }
}

/*
                    10     1000     100000    10000000
ArrayList:           1       1      1           0
LinkedList:          2       1      680         138954


 */
