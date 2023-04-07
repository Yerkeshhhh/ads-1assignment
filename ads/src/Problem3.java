import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(Helper(7, 2));
    }

    public static boolean Helper(int i, int n) {
        if (i<=1)
            return true;
        if (n%i==0)
            return false;
        else
            return Helper(n, i-1);
    }

    public static boolean isPrime(int a,int i){
        if(i <= 1){
            return true;
        } else if (a%i == 0) {
            return false;
        }
        return isPrime(a,i-1);
    }
}