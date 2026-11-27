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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if (lists.length > 0){
            ListNode res = lists[0];

        for (int i=1 ; i<lists.length ; i++){
            ListNode cur1 = res;
            ListNode cur2 = lists[i];

            ListNode ans = new ListNode(-1);
            ListNode tail = ans;

            while(cur1 !=null && cur2!=null){
                if(cur1.val <= cur2.val){
                    tail.next = cur1;
                    cur1 = cur1.next;
                }else{
                    tail.next = cur2;
                    cur2 = cur2.next;
                }
                tail = tail.next;
            }
            if(cur1 != null){
                tail.next = cur1;
            }

            if(cur2 != null){
                tail.next = cur2;
            }

            res = ans.next;
        
            }

            return res;
        }
        ListNode res = null;
        return res;
        
    }
}