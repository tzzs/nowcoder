public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int arr : array) {
            if (sum < 0) {
                sum = arr;
            } else {
                sum += arr;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}