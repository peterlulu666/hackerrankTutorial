package Recursion;

public class Main {
    public static int Summation(int number) {
        if (number <= 0) {
            return 0;

        } else {
            return number + Summation(number - 1);

        }
    }

    // n × m = m + m + m + ··· + m
    public static int Multiply(int n, int m) {
        if (n <= 0) {
            return 0;

        } else {
            return m + Multiply(n - 1, m);

        }

    }

    public static int Factorial(int number) {
        if (number <= 0) {
            return 1;

        } else {
            return number * Factorial(number - 1);

        }
    }

    public static int Exponentiation(int number, int power) {
        if (power <= 0) {
            return 1;

        }
        return number * Exponentiation(number, power - 1);

    }

    public static void main(String[] args) {
        int number = 100;
        System.out.println(Summation(number));
        System.out.println(Multiply(3, 3));
        System.out.println(Factorial(6));
        System.out.println(Exponentiation(3, 2));


    }
}
