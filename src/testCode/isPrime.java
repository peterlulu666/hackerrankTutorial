package testCode;

public class isPrime {
    public static void main(String[] args) {
        int number = 25;
        System.out.println(isPrimeNumber(number));


    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;

        } else if (number == 2) {
            return true;

        } else {
            for (int factor = 2; factor < number; factor++) {
                if (number % factor == 0) {
                    return false;

                }

            }
            return true;

        }

    }
}
