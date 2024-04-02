package org.example.linkedListCycle;

public class Solution {
    public static void main(String[] args) {

    }


    public static boolean hasCycle(ListNode head) {
        ListNode bindingNode = head.next;
        ListNode next = null;
        ListNode prev = null;
        boolean pos = false;

        while (true) {
            head = head.next;
            if (head.equals(head.next)) {
                return pos = true;
            } else if (head.equals(null)) {
                return pos = false;
            }
        }

    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
