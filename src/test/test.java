package test;

import java.util.Arrays;

public class test {
    public static void BinarySearch(int lowerBound, int upperBound, int[] arr, int number) {
        int mid = lowerBound + (upperBound - lowerBound) / 2;
        if (lowerBound > upperBound){
            System.out.println("The number is not in the array. ");
            return;

        }
        if (number > arr[mid]) {
            lowerBound = mid + 1;
            BinarySearch(lowerBound, upperBound, arr, number);

        } else if (number < arr[mid]) {
            upperBound = mid - 1;
            BinarySearch(lowerBound, upperBound, arr, number);

        } else {
            System.out.println("found the number. ");
            System.out.println("The number is in the index " + mid);

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
        BinarySearch(0, sortedArr.length - 1, sortedArr, 6);
        System.out.println("The binary search will work for sorted array. ");


    }


}
