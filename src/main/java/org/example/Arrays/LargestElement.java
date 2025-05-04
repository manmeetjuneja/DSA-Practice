package org.example.Arrays;

import java.util.Arrays;

import static org.example.Constants.Constants.BRUTE_FORCE;

public class LargestElement {

    public static void bruteForce(int[] arr) {
        // Sorting the array in ascending order.
        // returning the last
        int index = arr.length;
        Arrays.sort(arr);
        System.out.println("Largest Element is : "+arr[index-1]);

    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8,10,5,7,9};
        System.out.println(BRUTE_FORCE);
        bruteForce(arr1);
        bruteForce(arr2);
    }
}
