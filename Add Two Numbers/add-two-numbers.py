# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        head = ListNode(0)
        add, cur = 0, head

        while l1 or l2:
            _sum = add

            if l1:
                _sum += l1.val
                l1 = l1.next

            if l2:
                _sum += l2.val
                l2 = l2.next
            add, _sum = _sum / 10, _sum % 10
            cur.next = ListNode(_sum)
            cur = cur.next

        if add > 0:
            cur.next = ListNode(add)
            
        return head.next