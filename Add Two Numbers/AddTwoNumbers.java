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
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null || l2 != null) {
            int sum = add;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            add = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;

        }
        if (add > 0) {
            cur.next = new ListNode(add);
        }
        return head.next;
    }
}