package com.ynz.smart.sort;

import java.util.Arrays;

/**
 * Divide into small problems and solve them, and then Merge back to the big problem.
 * time complexity 0(n*long(n)), rather than O(n*n)
 * space complexity is higher than others(bubble, insert, selection), they sort in place.
 */
public class MergeSort extends Base {

    public static void main(String[] args) {
        System.out.println("unsorted array:" + Arrays.toString(numbs));
        //sort the array using the merge sort.
        mergeSort(numbs);
        System.out.println("sorted array:" + Arrays.toString(numbs));
    }

    public static void mergeSort(int[] inputArray) {
        System.out.println("divide input array:" + Arrays.toString(inputArray));

        // recursive base case: until a single element
        int length = inputArray.length;
        if (length <= 1) {
            return;
        }

        // middle point of input array,
        int middle = length / 2;

        // divide problem into two small problems
        // Split the original array into left and right arrays
        // extra space to store divided small problems.
        int[] leftArray = Arrays.copyOfRange(inputArray, 0, middle);
        int[] rightArray = Arrays.copyOfRange(inputArray, middle, inputArray.length);

        // Print the left and right arrays
        System.out.println("Left array: " + Arrays.toString(leftArray));
        System.out.println("Right array: " + Arrays.toString(rightArray));

        // solving two small problems respectively.
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, inputArray);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] inputArray) {
        System.out.println("merge input Array: " + Arrays.toString(inputArray));

        System.out.println("merge input Left array: " + Arrays.toString(leftArray));
        System.out.println("merge input Right array: " + Arrays.toString(rightArray));

        int leftArraySize = inputArray.length / 2;
        int rightArraySize = inputArray.length - leftArraySize;

        int i = 0;
        int l = 0;
        int r = 0;

        while (l < leftArraySize && r < rightArraySize) {
            if (leftArray[l] < rightArray[r]) {
                inputArray[i] = leftArray[l];
                i++;
                l++;

            } else {
                inputArray[i] = rightArray[r];
                i++;
                r++;
            }
        }
        //maybe one element left, then we need handle it
        while (l < leftArraySize) {
            inputArray[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightArraySize) {
            inputArray[i] = rightArray[r];
            i++;
            r++;
        }

        System.out.println("after merge Array: " + Arrays.toString(inputArray));
    }
}
