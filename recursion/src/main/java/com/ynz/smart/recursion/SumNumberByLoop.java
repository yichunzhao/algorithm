package com.ynz.smart.recursion;

import java.util.stream.IntStream;

public class SumNumberByLoop {

    public static int sum(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
