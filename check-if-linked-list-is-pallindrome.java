class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle of the linked list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        Node secondHalfHead = reverse(slow);

        // Step 3: Compare the first half and the reversed second half
        Node firstHalfHead = head;
        Node tempSecondHalf = secondHalfHead;

        while (tempSecondHalf != null) {
            if (firstHalfHead.data != tempSecondHalf.data) {
                return false;
            }
            firstHalfHead = firstHalfHead.next;
            tempSecondHalf = tempSecondHalf.next;
        }

        // Step 4: (Optional) Reverse the second half again to restore the list
        reverse(secondHalfHead);

        return true;
    }

    // Helper function to reverse the linked list
    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
