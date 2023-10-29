package com.ynz.smart.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListOrder {

    public static void main(String[] args) {
        int[] ints = {2, 7, 8, 9};

        var linkedList = new LinkedList<>();

        for (var intNum : ints) {
            linkedList.add(intNum);
        }

        var arrayList = new ArrayList<>();
        for (var intNum : ints) {
            arrayList.add(intNum);
        }

        System.out.println("linkedList:" + linkedList);
        System.out.println("arrayList:" + linkedList);

        linkedList.addFirst(100);
        arrayList.add(0, 100);

        System.out.println("linkedList:" + linkedList);
        System.out.println("arrayList:" + linkedList);

        linkedList.add(3, 200);
        arrayList.add(3, 200);

        System.out.println("linkedList:" + linkedList);
        System.out.println("arrayList:" + linkedList);

        var emptyLinkedList = new LinkedList<>();
        emptyLinkedList.addLast(10);
        System.out.println(emptyLinkedList);

    }
}
