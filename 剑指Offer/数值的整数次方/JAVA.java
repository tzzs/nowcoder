public class Solution {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            int count = 1;
            double result = 1;
            while (count <= exponent) {
                result = base * result;
                count++;
            }
            return result;
        } else {
            int count = 1;
            double result = 1;
            exponent = Math.abs(exponent);
            while (count <= exponent) {
                result = base * result;
                count++;
            }
            return 1 / result;
        }
    }
}