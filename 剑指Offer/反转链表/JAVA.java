/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode tmp = null;
        while (head.next != null) {
            tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        head.next = pre;
        pre = head;
        return pre;
    }
}