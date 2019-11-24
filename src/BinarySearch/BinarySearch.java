package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void BinarySearch(int lowerBoundIndex, int upperBoundIndex, int[] arr, int number) {
        if (upperBoundIndex >= lowerBoundIndex) {
            int midIndex = lowerBoundIndex + (upperBoundIndex - lowerBoundIndex) / 2;
            System.out.println("MidIndex is " + midIndex);
            if (number > arr[midIndex]) {
                System.out.println("The number we are looking for is greater than the number in mid index. We will look for the right side. ");
                lowerBoundIndex = midIndex + 1;
                BinarySearch(lowerBoundIndex, upperBoundIndex, arr, number);

            } else if (number < arr[midIndex]) {
                System.out.println("The number we are looking for is smaller than the number in mid index. We will look for the left side. ");
                upperBoundIndex = midIndex - 1;
                BinarySearch(lowerBoundIndex, upperBoundIndex, arr, number);

            } else {
                System.out.println("The number we are looking for is equal to the number in mid index. We found the number. ");
                System.out.println("The number is in the index " + midIndex);

            }

        } else {
            System.out.println("The number is not in the array. ");
        }

    }


    public static void main(String[] args) {
        int[] unsortedArr = {11, 3, 2, 9, 5, 4, 7, 8, 6, 10};
        System.out.println("The array is unsorted. ");
        System.out.println(Arrays.toString(unsortedArr));
        System.out.println("We will search for the number 6. ");
        BinarySearch(0, unsortedArr.length - 1, unsortedArr, 6);
        System.out.println("The binary search will not work for unsorted array. ");
        int[] sortedArr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("The array is sorted. ");
        System.out.println(Arrays.toString(sortedArr));
        System.out.println("We will search for the number 6. ");
        BinarySearch(0, sortedArr.length - 1, sortedArr, 11);
        System.out.println("The binary search will work for sorted array. ");


    }


}

