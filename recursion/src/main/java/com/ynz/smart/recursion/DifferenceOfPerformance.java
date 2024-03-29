package com.ynz.smart.recursion;

/**
 * the following experience shows that
 * 1) recursion do give 40 times better performance than loop.
 * 2) but it may cause stackoverflow when a big input.
 * <p>
 * In Java, tail call optimization is not guaranteed by the language specification.
 * <p>
 * This means that, in general, tail-recursive functions in Java are not automatically optimized to use a
 * constant amount of memory, and may still result in a stack overflow error for large input values.
 */
public class DifferenceOfPerformance {
    public static final int MILLION = 10_000;

    public static void main(String[] args) {
        long cur1 = System.currentTimeMillis();
        SumNumberByLoop.sum(MILLION);
        long end1 = System.currentTimeMillis();

        long cur2 = System.currentTimeMillis();
        SumNumberByRecursion.sum(MILLION);
        long end2 = System.currentTimeMillis();

        System.out.println("by loop:" + (end1 - cur1));
        System.out.println("by recursion:" + (end2 - cur2));
    }
}
