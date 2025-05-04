package org.example.Arrays;

import java.util.Arrays;

import static org.example.Constants.Constants.BRUTE_FORCE;
import static org.example.Constants.Constants.RECURSIVE_APPROACH;

public class LargestElement {

    public static void bruteForce(int[] arr) {
        // Sorting the array in ascending order.
        // returning the last
        int index = arr.length;
        Arrays.sort(arr);
        System.out.println("Largest Element is : "+arr[index-1]);
        //Time Complexity: O(N*log(N))
        //Space Complexity: O(n)
    }

    public static void recursiveApproach(int[] arr) {
        // Assuming  max as first element is array
        // iterating the array till length
        // changing the max if found more the assumed.
        int max = arr[0];
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element is : "+max);
//        Time Complexity: O(N)
//        Space Complexity: O(1)
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8,10,5,7,9};
        System.out.println(BRUTE_FORCE);
        bruteForce(arr1);
        bruteForce(arr2);
        System.out.println(RECURSIVE_APPROACH);
        recursiveApproach(arr1);
        recursiveApproach(arr2);
    }
}
