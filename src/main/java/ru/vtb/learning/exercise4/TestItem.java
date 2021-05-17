package ru.vtb.learning.exercise4;

import java.util.List;

public class TestItem {

    public TestItem(List<String> elem1, List<String> elem2) {
        //можно положить в один массив,  для красоты.
        this.elem1 = elem1;
        this.elemMessage1 = elem1.getClass().getName();
        this.elem2 = elem2;
        this.elemMessage2 = elem2.getClass().getName();
    }

    private List<String> elem1;
    private String elemMessage1;
    private List<String> elem2;
    private String elemMessage2;

    public List<String> getElem1() {
        return elem1;
    }

    public List<String> getElem2() {
        return elem2;
    }

    public String getElemMessage1() {
        return elemMessage1;
    }

    public String getElemMessage2() {
        return elemMessage2;
    }
}
