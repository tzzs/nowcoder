public class Solution {
    public int Add(int num1, int num2) {
        int s = num1 ^ num2;
        int f = (num1 & num2) << 1;
        while (f != 0) {// 判断是否有进位
            int tmp = s;// 存储上一轮结果
            s = s ^ f;// 进位后结果
            f = (tmp & f) << 1;// 与进位的进位
        }
        return s;
    }
}