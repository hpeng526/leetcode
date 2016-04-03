type ListNode struct {
    Val int
    Next *ListNode
}
 
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    var (
        add int
        sum int
        cur *ListNode
    )
    head := ListNode{0, nil}
    add, sum, cur = 0, 0, &head
    for l1 != nil || l2 !=nil {
        sum = add
        if l1 != nil {
            sum += l1.Val
            l1 = l1.Next
        }
        if l2 != nil {
            sum += l2.Val
            l2 = l2.Next
        }
        add = sum / 10;
        sum = sum % 10;
        cur.Next = &ListNode{sum, nil}
        cur = cur.Next
    }
    if add > 0 {
        cur.Next = &ListNode{add, nil}
    }
    return head.Next
}