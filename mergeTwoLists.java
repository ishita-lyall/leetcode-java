/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode ans_head = ans;
        while(list1!=null && list2!=null){
            if(list2.val>list1.val){
                ans_head.next = list1;
                list1 = list1.next;
            }
            else{
                ans_head.next = list2;
                list2 = list2.next;              
            }
            ans_head = ans_head.next;
    
        }
        if(list1!=null){
            ans_head.next=list1;
        }
        if(list2!=null){
            ans_head.next=list2;
        }       
        return ans.next;
    }
}
