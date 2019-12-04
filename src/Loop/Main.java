package Loop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input Format
        // A single integer
        int number;
        // Constraints
        // 2 to 20 inclusively
        while (true){
//            System.out.println("Enter a number ");
            number = scanner.nextInt();
            if (number <= 20 && number >= 2){
                break;

            }

        }
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);

        }

    }
}
