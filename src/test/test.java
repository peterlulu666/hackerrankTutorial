package test;

import java.util.*;
import java.io.*;

class Main {
    static int find(int[] integers) {
        // if integer[i] % 2 == 0 count ++
        int evenCount = 0;
        int oddCount = 0;
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
                evenIndex = i;


            } else {
                oddCount++;
                oddIndex = i;


            }


        }

        return evenCount == 1 ? integers[evenIndex] : integers[oddIndex];

    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, -10, 3};
        System.out.println(find(arr));


    }
}