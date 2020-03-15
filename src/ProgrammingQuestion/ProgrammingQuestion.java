package ProgrammingQuestion;

import java.util.Scanner;

public class ProgrammingQuestion {
    public static int startingNumber = 1;
    public static int endingNumber = 100;
    public static int perfectSquares = 30;

    public static void main(String[] args) {
        printHelloWorld();
        printOneHundredInteger();
        printPerfectSquares();
        var arr = inputInteger();
        printReverseOrder(arr);
        int sum = printSum(arr);
        int product = printProduct(arr);
        isIncreasingOrder(arr);
        largestAndSmallest(arr);
        printMean(arr, sum);
        String str = inputString();
        System.out.println(isPalindrome(str));
        System.out.println(checkPalindrome(str));
        System.out.println(allSubstring(str));
        System.out.println(countUnique(str));
        System.out.println(vowelsRemoved(str));
        printVowelsRemoved(str);




    }

    // Read a string from the user
    public static String inputString() {
        System.out.println("Enter a word ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;

    }

    // Ask the user for an integer N, reads in N integers
    public static int[] inputInteger() {
        System.out.println("Enter array size ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
//        scanner.nextLine();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + "th number ");
            arr[i] = scanner.nextInt();

        }
        scanner.nextLine();
        return arr;

    }

    // Prints “Hello World”
    public static void printHelloWorld() {
        System.out.println("Hello world");

    }

    // Prints the integers from 1 to 100
    public static void printOneHundredInteger() {
        for (int i = startingNumber; i <= endingNumber; i++) {
            System.out.println(i);

        }

    }

    // Prints the perfect squares from 1 to 30​^2
    public static void printPerfectSquares() {
        for (int i = startingNumber; i <= perfectSquares; i++) {
            System.out.println(i + " * " + i + " = " + (i * i));

        }

    }

    // prints them in reverse order
    public static void printReverseOrder(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(" ");
            }

        }
        System.out.println("\n");

    }

    // prints the total sum
    public static int printSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println("The sum is " + sum);

        return sum;

    }

    // prints the total product
    public static int printProduct(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];

        }
        System.out.println("The product is " + product);
        return product;

    }

    // decides if the numbers were entered in increasing order
    public static void isIncreasingOrder(int[] arr) {
        // number in indexA is greater than number in indexA - 1
        boolean isIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isIncreasing = false;
                break;

            }

        }
        if (isIncreasing) {
            System.out.println("It is in the increasing order. ");

        } else {
            System.out.println("It is not in the increasing order. ");

        }

    }

    // finds the largest and smallest values
    public static void largestAndSmallest(int[] arr) {
        // bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    // swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        System.out.println("The smallest number is " + arr[0]);
        System.out.println("The highest number is " + arr[arr.length - 1]);

    }

    // determines the mean and then counts how many were smaller than the mean
    public static void printMean(int[] arr, int sum) {
        double mean = (double) sum / arr.length;
        System.out.println("The mean is " + mean);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mean) {
                count++;

            }

        }
        System.out.println("There are " + count + " number smaller than the mean. ");
    }

    // determine if the string is a palindrome

    /**
     * isPalindrome
     *
     * @param str
     * @return true if the string is palindrome or false if the string is not palindrome
     */
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            // store the first letter in staringLetter
//            String startingLetter = str.substring(i, i + 1);
            char startingLetter = str.charAt(i);
            // store the last letter in endingLetter
//            String endingLetter = str.substring(str.length() - i - 1, str.length() - i);
            char endingLetter = str.charAt(str.length() - 1 - i);
            // compare the first letter and the last letter
//            if (!startingLetter.equals(endingLetter)){
//                return false;
//
//            }
            if (startingLetter != endingLetter) {
                return false;

            }

        }


        return true;
    }

    /**
     * checkPalindrome
     *
     * @param str
     * @return true if the string is palindrome or false if the string is not palindrome
     */
    public static boolean checkPalindrome(String str){
        int leftCount = 0;
        int rightCount = str.length() - 1;
        while (str.charAt(leftCount) == str.charAt(rightCount) && leftCount < rightCount){
            leftCount++;
            rightCount--;

        }

        if (leftCount >= rightCount){
            return true;

        }

        return false;

    }

    // print all substrings of the string

    /**
     * allSubstring
     *
     * @param str
     * @return all substrings of the string
     */
    public static String allSubstring(String str) {
        String letter = "";
        for (int i = 0; i < str.length(); i++) {
            // print first letter
//            letter = str.substring(0, 1);
            // print first and next letter
//            letter = letter + str.substring(0, 1) + str.substring(1,2);
            letter = letter + str.substring(0, i + 1);
            if (i < str.length() - 1) {
                letter = letter + ", ";

            }

        }

        return letter;

    }

    // determine how many unique letters are in the string

    /**
     * countUnique
     *
     * @param str
     * @return the number of unique letters
     */
    public static int countUnique(String str) {
        // compare character in index 0 with all character
        int count = 0;
        int unique = 0;
        String uniqueLetter = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            if (count == 1) {
                unique++;
                uniqueLetter = uniqueLetter + str.charAt(i) + " ";

            }
            System.out.println("The character " + str.charAt(i) + " present " + count + " times. ");
            count = 0;

        }
        System.out.println("There are " + unique + " unique letters. ");
        System.out.println("The unique letters are " + uniqueLetter);

        return unique;

    }

    // print all the string but with vowels removed
    public static String vowelsRemoved(String str) {
        // letter print l t t r
        String letter = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' &&
                    str.charAt(i) != 'e' &&
                    str.charAt(i) != 'i' &&
                    str.charAt(i) != 'o' &&
                    str.charAt(i) != 'u') {
                letter = letter + str.charAt(i);

            }
        }
        return letter;

    }

    public static void printVowelsRemoved(String str){
        // aaaabc
        // print bc
        // vowels is a e i o u
        for (int i = 0; i < str.length(); i++) {
            // when character is not vowels we would print the character
            if (str.charAt(i) != 'a' &&
                    str.charAt(i) != 'e' &&
                    str.charAt(i) != 'i' &&
                    str.charAt(i) != 'o' &&
                    str.charAt(i) != 'u'){
                System.out.print(str.charAt(i));

            }

        }


    }

}
