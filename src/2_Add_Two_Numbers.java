class ListNode{
    ListNode next;
    int val;

    ListNode(){}
    ListNode (int val){
        this.val = val;
        next = null;
    }
}

class Leetcode_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode();
        ListNode l3 = dummy_head;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            l3.next = node;
            l3 = l3.next;
        }
        return dummy_head.next;
    }
}
