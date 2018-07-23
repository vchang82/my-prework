import java.util.Stack;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Subtract {
    public ListNode subtract(ListNode A) {
        int length = 0;
        ListNode node = A;
        Stack<ListNode> stack = new Stack<ListNode>();

        while (node != null) {
            length++;
            stack.push(node);
            node = node.next;
        }
        node = A;
        int numtomodify = length / 2;
        for (int i = 0; i < numtomodify; i++) {
            node.val = stack.pop().val - node.val;
            node = node.next;
        }
        return A;
    }
}
