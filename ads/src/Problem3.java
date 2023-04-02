import java.util.Scanner;

public class Problem3 {
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        } else if (n % i == 0) {
            return false;
        } else if (i * i > n) {
            return true;
        } else {
            return isPrime(n, i+1);
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        boolean prime = isPrime(n, 2);
        if (prime) {
            System.out.println("prime");
        } else {
            System.out.println("сomposite");
        }
    }
}