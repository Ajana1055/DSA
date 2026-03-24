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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        int l=0;
        ListNode curr=head;
        while(curr!=null){
            if(n==1 && curr.next.next==null){
                curr.next=null;
                return head;
            }
            l++;
            curr=curr.next;

        }
        int k=l-n-1;
        if(l==n){
            return head.next;
        }
        curr=head;
        while(k>0){
       curr=curr.next;
       k--;
        }
        curr.next=curr.next.next;
        return head;
        
    }
}