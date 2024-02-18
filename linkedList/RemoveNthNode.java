
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        //create gap of n+1 nodes btw first and second node
        for (int i = 0; i <= n; i++) {
            second = second.next;
        }

        // move both until second reaches end
        while (second != null) {
            first = first.next;
            second = second.next;
        }

        // remove Nth node from end
        first.next = first.next.next;

        //return head
        return dummy.next;
    }
}
