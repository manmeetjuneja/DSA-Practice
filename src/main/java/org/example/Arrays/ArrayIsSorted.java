package org.example.Arrays;

import static org.example.Constants.Constants.BRUTE_FORCE;
import static org.example.Constants.Constants.OPTIMAL_APPROACH;

public class ArrayIsSorted {
    public static void bruteForce(int[] arr) {
        //comparing the elements.
        // as we need to check (ascending / Increasing / Non-decreasing)
        int low = arr[0];
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (low <= arr[i]) {
                low = arr[i];
            } else flag = false;
        }
        System.out.println(flag);
    }
        //    Time Complexity: O(N^2)
        //    Space Complexity: O(1)

    public static void recursiveApproach(int[] arr) {
    }

    public static void optimalApproach(int[] arr) {
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]) break;
            else flag=true;
        }
        System.out.println(flag);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 6, 7, 8};
        System.out.println(BRUTE_FORCE);
        bruteForce(arr1);
        bruteForce(arr2);
        System.out.println(OPTIMAL_APPROACH);
        optimalApproach(arr1);
        optimalApproach(arr2);

    }
}

