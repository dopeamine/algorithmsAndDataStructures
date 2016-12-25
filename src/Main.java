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
        linkedList.push(9);
        linkedList.printList();

        System.out.println("Inserting node after given node");
        //insert node after given node
        linkedList.insertAfter(second,3);
        linkedList.printList();

        System.out.println("Appending new node at end of list");
        //append - at end of linked list
        linkedList.append(5);
        linkedList.printList();

        //System.out.println("Deleting nodes from linked list");
        //delete first element from a linked list
        System.out.println("Deleting first element");
        linkedList.deleteNode(9);
        linkedList.printList();
        //delete last element from a linked list
        System.out.println("Deleting last element");
        linkedList.deleteNode(5);
        linkedList.printList();
        //delete in between element from a linked list
        System.out.println("Deleting element from in between");
        linkedList.deleteNode(2);
        linkedList.printList();

        // display count of linkedlist using iterative count
        System.out.println("Counting (iterative method) number of elements in linked list");
        System.out.println(linkedList.iterativeCount());

        // display count of linkedlist using recursive count
        System.out.println("Counting (recursive method) number of elements in linked list");
        System.out.println(linkedList.recursiveCount(linkedList.head));

        //push more elements
        linkedList.push(10);
        linkedList.append(12);
        linkedList.insertAfter(third,14);


        System.out.println("Swapping keys of 1 and 4");
        linkedList.swapKeys(1,4);
        linkedList.printList();
        System.out.println("Swapping keys of 10 and 3");
        linkedList.swapKeys(10,3);
        linkedList.printList();
        System.out.println("Swapping keys of 10 and 12");
        linkedList.swapKeys(10,12);
        linkedList.printList();

    }
}
