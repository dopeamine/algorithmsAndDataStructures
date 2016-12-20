/**
 * Created by shant on 20-12-2016.
 */
public class LinkedList {
    Node head;
/* Linked list Node.  This inner class is made static so that main() can access it */
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
}
