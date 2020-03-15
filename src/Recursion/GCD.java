package Recursion;

public class GCD {
    int numberOne;
    int numberTwo;

    // Constructor
    public GCD(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    int calculateGCD() {
        while (numberOne != numberTwo) {
            if (numberOne > numberTwo) {
                numberOne = numberOne - numberTwo;

            } else {
                numberTwo = numberTwo - numberOne;
            }
        }
        return numberTwo;

    }

    int calculateGCDRecursion(int numberOne, int numberTwo) {
        // Base case
        if (numberOne % numberTwo == 0) {
            return numberTwo;

        }

        int numberThree = numberOne % numberTwo;
        return this.calculateGCDRecursion(numberTwo, numberThree);

    }

    public static void main(String[] args) {
        var gcd = new GCD(36, 24);
        System.out.println(gcd.calculateGCD());
        System.out.println(gcd.calculateGCDRecursion(36, 24));

    }
}
