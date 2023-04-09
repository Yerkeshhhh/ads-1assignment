import java.util.Scanner;

/*
isPrimeHelper - this function is helper function to @isPrime to check if the integer n is prime
isPrime - checks if the n is prime
n - inputted integer
d - divisor to check n is prime
 */


public class Problem3 {
    public static boolean isPrime(int n) {
        if (n==1 && n==0) {
            return false;
        } else if (n==2) {
            return true;
        } else if (n%2==0) {
            return false;
        }
        return isPrimeHelper(n,3);
    }

    public static boolean isPrimeHelper(int n, int d) {
        if (d>Math.sqrt(n)) {
            return true;
        } else if (n%d==0) {
            return false;
        }
        return isPrimeHelper(n, d+2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean prime = isPrime(n);
        if (prime) {
            System.out.println("Prmie");
        } else {
            System.out.println("Composite");
        }
    }
}