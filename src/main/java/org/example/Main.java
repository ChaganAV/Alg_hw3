package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.printList();
//        ll.addLast(6);
//        ll.addLast(7);
//        ll.addLast(8);
//        ll.addLast(9);
//        ll.addLast(10);
//        ll.printList();
        ll.revert();
        ll.printList();
    }
}