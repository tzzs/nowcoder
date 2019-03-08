public class Solution {
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            {
                return 1;
            }
        }
        int i = 0, j = 1, k = 2;
        while (k <= n) {
            int tmp = j;
            j = i + j;
            i = tmp;
            k++;
        }
        return j;
    }
}