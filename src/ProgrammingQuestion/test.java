package ProgrammingQuestion;

import java.util.Arrays;

public class test {
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
                    // Move minimumIndex
                    minimumIndex = unsortedIndex;

                }

            }
            // Swap the number in boundaryIndex and the number in minimumIndex
            int temp = arr[boundaryIndex];
            arr[boundaryIndex] = arr[minimumIndex];
            arr[minimumIndex] = temp;


        }


    }
}
