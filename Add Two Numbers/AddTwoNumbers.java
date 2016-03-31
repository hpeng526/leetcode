/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        ListNode head = null;
        ListNode cur = null;
        while(l1 != null && l2 != null) {
            int val = l1.val + l2.val + add;
            ListNode newNode = new ListNode(val % 10);
            if(head == null) {
                head = newNode;
            } else {
                cur.next = newNode;
            }
            cur = newNode;
            add = val / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int val = l1.val + add;
            ListNode newNode = new ListNode(val % 10);
            if(head == null) {
                head = newNode;
            } else {
                cur.next = newNode;
            }
            cur = newNode;
            add = val / 10;
            l1 = l1.next;
        }
        while (l2 != null) {
            int val = l2.val + add;
            ListNode newNode = new ListNode(val % 10);
            if(head == null) {
                head = newNode;
            } else {
                cur.next = newNode;
            }
            cur = newNode;
            add = val / 10;
            l2 = l2.next;
        }
        if (add > 0) {
            ListNode newNode = new ListNode(add);
            cur.next = newNode;
        }
        return head;
    }
}