
/*
@power - it returns the value of a raised to the power of n
a - the integer that raised to the power of n
n - power of a
 */

public class Problem6 {
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(power(a, n));
    }
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }
}