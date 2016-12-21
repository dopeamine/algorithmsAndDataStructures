public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LinkedList linkedList=new LinkedList();
        linkedList.head= new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(4);
        linkedList.head.next = second;
        second.next = third;

        System.out.println("Printing newly created linked list");
        linkedList.printList();

        System.out.println("Pushing element in linked list");
        //push node
        linkedList.push(0);
        linkedList.printList();

        System.out.println("Inserting node after given node");
        //insert node after given node
        linkedList.insertAfter(second,3);
        linkedList.printList();

        System.out.println("Appending new node at end of list");
        //append - at end of linked list
        linkedList.append(5);
        linkedList.printList();

        System.out.println("Deleting nodes from linked list");
        //delete first element from a linked list
        System.out.println("Deleting first element");
        linkedList.deleteNode(0);
        linkedList.printList();
        //delete last element from a linked list
        System.out.println("Deleting last element");
        linkedList.deleteNode(5);
        linkedList.printList();
        //delete in between element from a linked list
        System.out.println("Deleting element from in between");
        linkedList.deleteNode(3);
        linkedList.printList();

    }
}
