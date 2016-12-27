/**
 * Created by shant on 20-12-2016.
 */
public class LinkedList {
    //Node head;
/* Linked list Node.  This inner class is made static so that main() can access it */
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void printList(Node head){
        Node node = head;
        while (node != null){
            System.out.print(node.data+"\t");
            node = node.next;
        }
        System.out.println();
    }
    public Node push(int newData, Node head){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public Node insertAfter(Node head, int data, int newData){
        Node tempHead=head;
        if(head==null) return null;
        while(head!=null && head.data!=data){
            head=head.next;
        }
        Node newNode = new Node(newData);
        newNode.next = head.next;
        head.next = newNode;
        return tempHead;
    }
    public void append(int newData,Node head){
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
    public void deleteNode(int key,Node head){
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
    public int iterativeCount(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public int recursiveCount(Node head){
        if (head== null) return 0;
        return 1 + recursiveCount(head.next);
    }
    public void swapKeys(int key1, int key2, Node head){
        if (key1==key2) return;

        Node temp1 = head;
        Node temp2 = head;
        Node prevTemp1=null, prevTemp2 = null;

        while (temp1!=null && temp1.data!=key1){
//            System.out.println(temp1.data);
            prevTemp1=temp1;
            temp1=temp1.next;
        }
        while (temp2!=null && temp2.data!=key2){
//            System.out.println(temp2.data);
            prevTemp2=temp2;
            temp2=temp2.next;
        }
        if (temp1==null || temp2==null) return;
        if (prevTemp1!=null){
            prevTemp1.next=temp2;
        }else{
            head=temp2;
        }
        if (prevTemp2!=null){
            prevTemp2.next=temp1;
        }else{
            head=temp1;
        }
        //prevTemp2.next=temp1;
        Node temp = temp1.next;
        temp1.next=temp2.next;
        temp2.next=temp;

    }
    public Node reverseList(Node head){
        Node prev=null, curr=head, next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
//    public Node recursiveReverse(Node head){
//       Node first=null, rest=null;
//       first=head;
//       rest=head.next;
//       if(rest==null){
//           return first;
//       }
//       recursiveReverse(rest);
//       first.next.next=first;
//       first.next=null;
//       head=rest;
//       return head;
//    }
    public Node mergeSorted(Node head1, Node head2){
        //using new node and append elements
        Node mainHead=null;
        Node tempHead=null;
        Node mergedHead=null;
        boolean firstIter=true;
        while (head1!=null&&head2!=null){
            System.out.println(head1.data+"  "+head2.data);
            if (head1.data<head2.data){
                tempHead=head1;
                tempHead.next=head2;
                //tempHead=head2;
            }else{
                tempHead=head2;
                tempHead.next=head1;
                //tempHead=head1;

            }
            if (firstIter){
                mainHead=tempHead;
                mergedHead=mainHead.next;
                firstIter=false;
            }else {
                mergedHead.next=tempHead;
            }
            if (head1.next!=null) head1=head1.next;
            if (head2.next!=null) head2=head2.next;
        }
        return mainHead;
    }
}
