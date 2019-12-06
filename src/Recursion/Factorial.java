package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int Factorial(int number) {
        number = Math.abs(number);
        // Base case
        if (number <= 0) {
            return 1;

        } else {
            return number * Factorial(number - 1);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number ");
        int number = scanner.nextInt();
        System.out.println(Factorial(number));

    }
}
