package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size ");
        // Read size through scanner.nextLine()
        String sizeStr = scanner.nextLine();
        // String size to int size
        int size = Integer.parseInt(sizeStr);
        // Scanner is skipping nextLine() after using nextInt()
        // We would not use nextInt() before nextLine()
        // What if we really want to use nextInt() to read size
        // We would add scanner.nextLine() after scanner.nextInt() to consume rest of that line including newline,
        // so the following nextLine() will work fine
//        int size = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter array and use space to separate integer ");
        String arrStr = scanner.nextLine();
        // String to string array
        String[] arrStrSplit = arrStr.split(" ");
        scanner.close();
//        size = arrStrSplit.length;
        // String array to integer array
        int[] numberArr = new int[size];
        for (int i = 0; i < size; i++) {
            numberArr[i] = Integer.parseInt(arrStrSplit[i]);

        }

        // Print array in reverse order
//        System.out.print("[");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numberArr[i]);
            // The last space will be removed
            if (i > 0) {
                System.out.print(" ");

            }

        }
//        System.out.print("]");

        // Print array in reverse order
//        int[] reversedNumberArr = new int[size];
//        int count = size;
//        for (int i = 0; i < size; i++) {
//            reversedNumberArr[count - 1] = numberArr[i];
//            count--;
//
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.print(reversedNumberArr[i]);
//            if (i < size - 1) {
//                System.out.print(" ");
//
//            }
//
//        }
//
    }
}
