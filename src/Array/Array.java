package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size ");
        int size = scanner.nextInt();
//        scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
//            System.out.println("Enter the " + (i + 1) + "th " + " number ");
            arr[i] = scanner.nextInt();

        }

        // Print array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(" ");

            }

        }

        // Print array in reverse order
        // 1 2 3 4 5 int temp
        // 1 2 3 4 5 6 int temp
        // 1 2 3 4 5 6 7 8 int temp
        // 1 2 3 4 5 6 7 8 9 int temp
        for (int i = 0; i < (arr.length) / 2; i++) {
            int temp = arr[i];
            // Shift
            arr[i] = arr[arr.length - 1 - i];
            // Replace
            arr[arr.length - 1 - i] = temp;

        }

        System.out.println(Arrays.toString(arr));

        // Print array in reverse order
//        int[] reversedArr = new int[size];
//        int count = size;
//        for (int i = 0; i < size; i++) {
//            reversedArr[count - 1] = arr[i];
//            count--;
//
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.print(reversedArr[i]);
//            if (i < size - 1) {
//                System.out.print(" ");
//
//            }
//
//        }

    }
}
