
/*
@factorial - it takes n and returns it's factorial
n- inputted integer
 */

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int n) {
        if (n==1)
            return 1;

            return n * factorial(n - 1);
    }
}