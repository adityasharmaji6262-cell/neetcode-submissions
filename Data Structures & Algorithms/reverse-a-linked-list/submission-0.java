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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            // 1. Temporarily store the next node
            ListNode nextNode = curr.next;
            
            // 2. Flip the current node's pointer backward
            curr.next = prev;
            
            // 3. Move the tracking pointers one step forward
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
