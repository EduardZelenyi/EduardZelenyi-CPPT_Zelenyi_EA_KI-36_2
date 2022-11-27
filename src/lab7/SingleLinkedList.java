package lab7;

public class SingleLinkedList {
    public Node head = null;
    public Node last = null;

    public static int sum;

    public SingleLinkedList() {
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;

        } else {
            this.last.next = newNode;
        }

        this.last = newNode;
    }

    public void printList() {
        Node current = this.head;
        if (this.head == null) {
            System.out.println("Empty");
        } else {
            System.out.println("Single Linked List: ");

            while(current != null) {
                if (current.data %2 != 0) {
                    sum = sum + current.data;
                }
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }

    public int findMin() {
        Node minNode = this.head;

        int data;
        for(data = minNode.data; minNode.next != null; minNode = minNode.next) {
            if (data > minNode.next.data) {
                data = minNode.next.data;
            }
        }

        System.out.println("Min data of list is: " + data);
        return data;
    }

    public static void main(String[] args) {
        SingleLinkedList singleList = new SingleLinkedList();
        singleList.insert(3);
        singleList.insert(8);
        singleList.insert(7);
        singleList.insert(8);
        singleList.insert(7);
        singleList.insert(8);
        singleList.printList();
        singleList.findMin();
        System.out.println(sum);
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
