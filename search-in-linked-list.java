class Solution {
    static boolean searchKey(int n, Node head, int key) {
        Node current = head;  // Start from the head of the linked list
        
        // Traverse the list until you find the key or reach the end
        while (current != null) {
            if (current.data == key) {  // If the current node contains the key
                return true;
            }
            current = current.next;  // Move to the next node
        }
        
        return false;  // If the key is not found
    }
}
