package ru.vtb.learning.exercise5;

import ru.vtb.learning.exercise4.Factory;
import ru.vtb.learning.exercise4.TestItem;

import java.util.List;

public class Program {
    public static void main(String[] args) {


        System.out.println("100 element");
        Delete(Factory.Get(100));

        System.out.println("10000 element");
        Delete(Factory.Get(10000));

        System.out.println("100000 element");
        Delete(Factory.Get(100000));
    }

    private static void Delete(TestItem item) {
        List<String> elm1 = item.getElem1();
        int startElm1 = elm1.size() / 4;
        int lenElm1 = elm1.size() / 2;
        List<String> elm2 = item.getElem2();
        int startElm2 = elm2.size() / 4;
        int lenElm2 = elm1.size() / 2;

        long time = System.currentTimeMillis();

        for (int j = 0; j < lenElm1; j++) {
            elm1.remove(startElm1);
        }
        System.out.println("Time: for " + item.getElemMessage1() + " - " + (System.currentTimeMillis() - time));

        long time2 = System.currentTimeMillis();

        for (int j = 0; j < lenElm2; j++) {
            elm2.remove(startElm2);
        }

        System.out.println("Time: for " + item.getElemMessage2() + " - " + (System.currentTimeMillis() - time2));


    }

    /*
                    100     10000     100000
ArrayList:           0       4          380
LinkedList:          0       22         1649


 */
}
