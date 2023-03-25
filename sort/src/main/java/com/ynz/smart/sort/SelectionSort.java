package com.ynz.smart.sort;

import java.util.Arrays;

/**
 * selection sorting: selecting current one as the min, and comparing with the rest, then updating min.
 * time complexity, the worst case: O[n^2], the best case: O[n]
 */
public class SelectionSort extends Base {

    public static void sort(int[] ints) {

        // traverse each element in the array
        for (int i = 0; i < ints.length; i++) {
            //and assume current integer as the min value.
            int min = ints[i];

            //and starting from next bucket to the end, and comparing with the min.
            for (int j = i + 1; j < ints.length; j++) {

                // afterwards finding a new min. value
                if (ints[j] < min) {
                    //moving current j bucket value to temp.
                    int temp = ints[j];

                    //modify current min to the latest min value
                    min = ints[j];

                    // swap ith and jth value
                    ints[j] = ints[i];
                    ints[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Base.numbs));
        SelectionSort.sort(Base.numbs);
        System.out.println(Arrays.toString(Base.numbs));
    }
}
