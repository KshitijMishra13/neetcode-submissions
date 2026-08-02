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
        PriorityQueue<ListNode> q = new PriorityQueue<>((a, b)->a.val-b.val);
        for(ListNode l:lists){
            if(l!=null) q.add(l);
        }
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(!q.isEmpty()){
            ListNode smallest = q.poll();
            tail.next = smallest;
            tail = tail.next;
            if(smallest.next!=null){
                q.add(smallest.next);
            }
        }return dummy.next;
    }
}
