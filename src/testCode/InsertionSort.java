package testCode;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void insertionSort(int[] arr) {
        for (int boundaryIndex = 1; boundaryIndex < arr.length; boundaryIndex++) {
            int temp = arr[boundaryIndex];
            for (int sortedIndex = boundaryIndex - 1; sortedIndex >= 0; sortedIndex--) {
                if (temp < arr[sortedIndex]) {
                    // Shift
                    arr[sortedIndex + 1] = arr[sortedIndex];
                    // Replace
                    arr[sortedIndex] = temp;


                }

            }

        }

    }

}
