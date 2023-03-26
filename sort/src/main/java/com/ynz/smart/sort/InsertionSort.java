package com.ynz.smart.sort;

import java.util.Arrays;

/**
 * divide the array into sorted and unsorted parts.
 *
 * assuming the first element of the array as the default sorted part.
 */
public class InsertionSort extends Base {

    public static void sort(int[] ints) {
        //traverse unsorted part.
        for (int i = 1; i < ints.length; i++) {
            // visit current unsorted element, and put it in a temp
            int currentUnsorted = ints[i];

            // sorted part, first element index
            int j = i - 1;

            // comparing with the sorted part one by one
            while (j >= 0 && currentUnsorted < ints[j]) {
                ints[j+1] = ints[j];
                ints[j] = currentUnsorted;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Base.numbs));
        InsertionSort.sort(Base.numbs);
        System.out.println(Arrays.toString(Base.numbs));
    }
}
