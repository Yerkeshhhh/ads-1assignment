
/*
findMinimum - finds the minimum value in an array of integers
n - lenght of array
arr - array
 */



public class Problem1 {
    public static int findMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMinimum(arr, n - 1);
        if (arr[n - 1] < min) {
            min = arr[n - 1];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        int n = 5;
        int min = findMinimum(arr, n);
        System.out.println(min);
    }
}