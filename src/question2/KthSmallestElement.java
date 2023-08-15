package question2;

import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 3, 9, 1};
        int k = 3;

        System.out.println(findKthSmallest(arr,k));
    }

    public static String findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        int kthSmallest = arr[k - 1];
        return "k'th smallest array element is " + kthSmallest;
    }
}
