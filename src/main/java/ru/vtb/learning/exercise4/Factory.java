package ru.vtb.learning.exercise4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Factory {
    private static List<String> GetArrayList(int capacity){
        ArrayList<String> arrayList = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            arrayList.add(String.valueOf(i));
        }
        return arrayList;

    }

    private static List<String> GetLinkedList(int capacity){
        return new LinkedList<String>(GetArrayList(capacity));
    }

    public static TestItem Get(int capacity){
        List<String> elm1 = GetArrayList(capacity);
        List<String> elm2 = GetLinkedList(capacity);
        return new TestItem(elm1, elm2);
    }
}
