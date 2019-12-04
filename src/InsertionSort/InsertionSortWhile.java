package InsertionSort;

import java.util.Arrays;

public class InsertionSortWhile {
    public static void insertionSort(int[] arr) {
        for (int boundaryIndex = 1; boundaryIndex < arr.length; ++boundaryIndex) {
            int temp = arr[boundaryIndex];

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
//            while (mover >= 0 && arr[mover] > temp) {
//                arr[mover + 1] = arr[mover];
//                arr[mover] = temp;
//                mover = mover - 1;
//            }
            for (int sortedIndex = boundaryIndex - 1; sortedIndex >= 0; sortedIndex--) {
                if (temp < arr[sortedIndex]) {
                    arr[sortedIndex + 1] = arr[sortedIndex];
                    arr[sortedIndex] = temp;

                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 3, 2, 9, 5, 4, 7, 8, 6, 10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}

