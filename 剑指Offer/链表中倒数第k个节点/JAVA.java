/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode p = head, q = head;
        int count = 0;
        while (p != null) {
            p = p.next;
            if (count >= k) {
                q = q.next;
            }
            count++;
        }
        return count >= k ? q : null;
    }
}