import java.util.Arrays;
import java.util.List;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,18,-1,6};
        int k = 17;

        System.out.printf("" + doesListHasSumPair(arr, k));
    }

    // N^2 complexity
    private static boolean doesListHasSumPair(int[] arr, int k) {
        for(int i =0; i< arr.length; i++){
            for (int j= i; j< arr.length;j++){
                if(arr[j] == k - arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
