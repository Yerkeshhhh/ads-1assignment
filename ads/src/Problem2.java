import java.util.Scanner;
/*
arrayAverage - calculates the average value of an integer array
arraySum - calculates the sum of all the elements in an integer array
arr - array
n - lenght of array
 */


public class Problem2 {

    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        double average = arrayAverage(arr);
        System.out.println(average);
    }

    public static double arrayAverage(int[] arr) {
        return arraySum(arr, arr.length) / (double)arr.length;
    }

    private static int arraySum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            return arr[n-1] + arraySum(arr, n-1);
        }
    }

}