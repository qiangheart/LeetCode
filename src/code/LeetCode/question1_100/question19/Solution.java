package code.LeetCode.question1_100.question19;

import code.LeetCode.LinkedListTest.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode q = dummyHead;

        for (int i = 0; i < n + 1; i++) {
            q = q.next;
        }
        while(q != null){
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return dummyHead.next;
    }
}
