public class Solution {
    public void reOrderArray(int[] array) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int k = array[i];
            if (k % 2 == 0) {//偶数
                list.add(k);
            } else {
                array[count++] = k;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            array[count++] = list.get(i).intValue();
        }
    }
}