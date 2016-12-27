public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LinkedList linkedList=new LinkedList();
        LinkedList.Node head= new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(4);
        head.next=second;
        second.next=third;
        third.next=null;

        System.out.println("Printing newly created linked list");
        linkedList.printList(head);

        System.out.println("Pushing element in linked list");
        //push node
        head = linkedList.push(9,head);
        linkedList.printList(head);

        System.out.println("Inserting node after given node");
        //insert node after given node data
        head = linkedList.insertAfter(head, 2, 3);
        head = linkedList.insertAfter(head,9,12);
//        head = linkedList.insertAfter(head,5,16);
        linkedList.printList(head);

        System.out.println("Appending new node at end of list");
        //append - at end of linked list
        linkedList.append(5,head);
        linkedList.printList(head);

        //System.out.println("Deleting nodes from linked list");
        //delete first element from a linked list
        System.out.println("Deleting first element");
        linkedList.deleteNode(9,head);
        linkedList.printList(head);
        //delete last element from a linked list
        System.out.println("Deleting last element");
        linkedList.deleteNode(5,head);
        linkedList.printList(head);
        //delete in between element from a linked list
        System.out.println("Deleting element from in between");
        linkedList.deleteNode(2,head);
        linkedList.printList(head);

        // display count of linkedlist using iterative count
        System.out.println("Counting (iterative method) number of elements in linked list");
        System.out.println(linkedList.iterativeCount(head));

        // display count of linkedlist using recursive count
        System.out.println("Counting (recursive method) number of elements in linked list");
        System.out.println(linkedList.recursiveCount(head));

        //push more elements
        System.out.println("Pushing element in linked list");
        linkedList.push(10,head);
        linkedList.printList(head);
        System.out.println("Appending new node at end of list");
        linkedList.append(12,head);
        linkedList.printList(head);
        System.out.println("Inserting node after given node");
        linkedList.insertAfter(head, 9,14);
        linkedList.printList(head);

        System.out.println("Swapping keys of 1 and 4");
        linkedList.swapKeys(1,4,head);
        linkedList.printList(head);
        System.out.println("Swapping keys of 10 and 3");
        linkedList.swapKeys(10,3,head);
        linkedList.printList(head);
        System.out.println("Swapping keys of 10 and 12");
        linkedList.swapKeys(10,12,head);
        linkedList.printList(head);
        System.out.println("Reversing linked list");
        head = linkedList.reverseList(head);
        linkedList.printList(head);
//        System.out.println("Reversing linked list using recursive method");
//        head = linkedList.recursiveReverse(head);
//        linkedList.printList(head);

        //merge two sorted linked list
        //define 2 new linked lists
        int[] arr1={3,5,8,24,65};
        int[] arr2={2,6,9,15,36};
        LinkedList.Node head1=new LinkedList.Node(1);
        LinkedList.Node head2=new LinkedList.Node(0);
        for (int i=0;i<arr1.length;i++){
            linkedList.append(arr1[i],head1);
            linkedList.append(arr2[i],head2);
        }
        System.out.println("Printing new lists");
        linkedList.printList(head1);
        linkedList.printList(head2);
        //call the merge function
        LinkedList.Node newHead=linkedList.mergeSorted(head1, head2);
        linkedList.printList(newHead);
        //linkedList.printList(head1);
        linkedList.printList(head2);

    }
}
