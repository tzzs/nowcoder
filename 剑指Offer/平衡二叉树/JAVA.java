import java.lang.Math;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return (deep(root) >= 0) ? true : false;
    }

    public int deep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = deep(root.left);
        int r = deep(root.right);
        if (l == -1 || r == -1)
            return -1;
        if (Math.abs(l - r) > 1)
            return -1;
        return l > r ? l + 1 : r + 1;
    }
}