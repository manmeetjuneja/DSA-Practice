package org.example.Arrays;

import java.util.Arrays;

import static org.example.Constants.Constants.BRUTE_FORCE;

public class SecondSmallest_SecondLargest {
    public static void bruteForce(int[] arr) {
        // Sorting the array in ascending order
        // returnin the elements in order
        // of not found will return -1

        int size = arr.length;
        if (size == 0 || size == 1) {
            System.out.println("-1");
        } else {
            Arrays.sort(arr);
            System.out.println("Second Small : " + arr[1]);
            System.out.println("Second Largest : " + arr[size - 2]);
        }
    }
//    Time Complexity: O(NlogN), For sorting the array
//    Space Complexity: O(1)

    public static void recursiveApproach() {
        // we will try to find the array in single traversal 
    }

    public static void betterApproach() {

    }

    public static void optimalApproach() {

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        System.out.println(BRUTE_FORCE);
        bruteForce(arr);
    }
}
