package testCode;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void selectionSort(int[] arr) {
        for (int boundaryIndex = 0; boundaryIndex < arr.length; boundaryIndex++) {
            int minimumIndex = boundaryIndex;
            for (int unsortedIndex = boundaryIndex + 1; unsortedIndex < arr.length; unsortedIndex++) {
                if (arr[minimumIndex] > arr[unsortedIndex]) {
                    // Move the minimumIndex
                    minimumIndex = unsortedIndex;

                }

            }
            // Swap the number is in minimumIndex with number in boundaryIndex
            int temp = arr[minimumIndex];
            arr[minimumIndex] = arr[boundaryIndex];
            arr[boundaryIndex] = temp;

        }

    }
}
