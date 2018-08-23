class Node {
    constructor(value, next) {
        this.value = value;
        this.next = next;
    }
}

class SinglyLinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    get(index) {
        let tempIndex = index;
        if (tempIndex < 0 || tempIndex > this.count - 1) {
            console.log("Invalid index");
            return -1;
        } else {
            let head = this.head;
            while (tempIndex > 0) {
                head = head.next;
                tempIndex--;
            }
            console.log(`Element at ${index} is ${head.value}`);
            return head.value;
        }
    }

    addAtHead(value) {
        let node = new Node(value, null);
        if (this.head === null) {
            this.head = node;
            this.tail = this.head;
            this.count++;
        } else {
            node.next = this.head;
            this.head = node;
            this.count++;
        }
    }

    addAtTail(value) {
        let node = new Node(value, null);
        if (this.tail === null) {
            this.tail = node;
            this.head = this.tail;
            this.count++;
        } else {
            this.tail.next = node;
            this.tail = node;
            this.count++;
        }

    }

    addAtIndex(index, value) {
        let node = new Node(value, null);
        let tempIndex = index;
        if (tempIndex < 0 || tempIndex > this.count) {
            console.log("Invalid index");
            return -1;
        } else {
            let prev = this.head;
            while (tempIndex > 1) {
                prev = prev.next;
                tempIndex--;
            }
            if (prev === null) {
                this.head = node;
                this.tail = this.head;
                this.count++;
            } else {
                node.next = prev.next;
                prev.next = node;
                if (prev === this.tail) this.tail = node;
                this.count++;
            }
        }

    }

    deleteAtIndex(index) {
        let tempIndex = index;
        if (tempIndex < 0 || tempIndex > this.count - 1) {
            console.log("Invalid index");
            return -1;
        } else {
            let prev = this.head;
            while (tempIndex > 1) {
                prev = prev.next;
                tempIndex--;
            }
            console.log(prev);
            if (this.tail === prev.next) {
                prev.next = null;
                this.tail = prev;
                this.count--;
            } else {
                prev.next = prev.next.next;
                this.count--;
            }
        }
    }

    print() {
        let arr = []
        if (this.head && this.tail) {
            console.log("Head at: ", this.head.value, "Tail at: ", this.tail.value)
            let head = this.head;
            while (head !== null) {
                arr.push(head.value);
                head = head.next;
            }
            console.log(`${arr.join(" -> ")} Count:  ${this.count}`);
        }
    }
}