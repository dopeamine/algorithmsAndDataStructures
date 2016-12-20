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
    public void printList(){
        Node node = head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int newData){
        if (prevNode == null){
            System.out.println("Given previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void append(int newData){
        Node newNode = new Node(newData);
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;
    }
}
