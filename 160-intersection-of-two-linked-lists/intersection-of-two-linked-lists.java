/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Boolean> vis = new HashMap<>();
        while (headA != null) {
            vis.put(headA, true);
            headA = headA.next;
        }
        while (headB != null) {
            if (vis.containsKey(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}