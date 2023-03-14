package com.ynz.smart.sort;

import java.util.Arrays;

public class BasicSortBubble {
    private static int[] numbs = {108, 5, 36, 3, 8, 120, 1, 0, 12, 22};

    private static void sort(int[] numbs) {
        int loops = 0;
        while (true) {
            int counter = 0;
            // stop looping before the last element.
            for (int i = 0; i < numbs.length - 1; i++) {
                // exchange the big one to tail.
                if (numbs[i] > numbs[i + 1]) {
                    int temp = numbs[i];
                    numbs[i] = numbs[i + 1];
                    numbs[i + 1] = temp;
                    counter++;
                }
            }

            loops++;
            //if there is no exchange, meaning sorted.
            if (counter == 0) {
                System.out.println("total loops:" + loops);
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbs));
        sort(numbs);
        System.out.println(Arrays.toString(numbs));
    }
}
