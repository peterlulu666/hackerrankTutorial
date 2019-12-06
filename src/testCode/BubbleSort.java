package testCode;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));




    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int indexA = 0; indexA < arr.length - 1; indexA++) {
                if (arr[indexA] > arr[indexA + 1]) {
                    // Swap
                    int temp = arr[indexA];
                    arr[indexA] = arr[indexA + 1];
                    arr[indexA + 1] = temp;

                }


            }

        }

    }
}
