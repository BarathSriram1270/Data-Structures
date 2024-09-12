class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // Initialize three pointers: prev, curr, and next.
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        // Iterate through the linked list.
        while (curr != null) {
            // Store the next node.
            next = curr.next;
            // Reverse the current node's pointer.
            curr.next = prev;
            // Move the prev and curr one step forward.
            prev = curr;
            curr = next;
        }
        
        // After the loop, prev will be the new head.
        return prev;
    }
}

