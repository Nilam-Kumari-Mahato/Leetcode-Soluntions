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

        int len = getlength(head);
        ListNode prevn = head ;
        ListNode node = head;

        for(int i=1 ;i<(len-n) ; i++){
            prevn = prevn.next;
        }

        if(len == 1 || len == n){
            head = head.next;
        }
        else{
            node = prevn.next;
            prevn.next = node.next;
        }
        return head;        
    }

    public int getlength(ListNode head){
        ListNode temp = head;
        int length =0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
}