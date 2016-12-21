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
    public void deleteNode(int key){
        Node temp = head, prev = null; // prev node needed to link to next node
        //if node to be deleted is the head node
        if (temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        //traverse list to search for key to be deleted
        while(temp != null && temp.data != key){
            prev =  temp;
            temp = temp.next;
        }
        //if key was not present in linked list, temp is null
        if (temp == null) return;
        //unlink node from linked list
        prev.next = temp.next;
    }
    public int iterativeCount(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public int recursiveCount(Node node){
        if (node == null) return 0;
        return 1 + recursiveCount(node.next);
    }
}
