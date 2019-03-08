public class Solution {
    public int NumberOf1(int n) {
        String x = java.lang.Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}