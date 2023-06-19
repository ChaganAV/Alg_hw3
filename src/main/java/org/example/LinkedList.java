package org.example;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class LinkedList {
    private Node head;
    private Node tail;
    public class Node{
        int value;
        Node next;
        Node previous;

        @Override
        public String toString() {
            return "Node{" + "value=" + value + ", next=" + next + '}';
        }
    }

    public void revert(){
        // 5 4 3 2 1
        Node curr = head; // 5
        Node newHead = null;
        Node newTail = null;
        while(curr != null){ // 5 4 3
            Node previous = curr.previous; // null 5 4
            Node next = curr.next; // 4 3 2
            if(previous == null){
                newTail = curr; // 5
            }
            if(next == null){
                newHead = curr; //
            }
            curr.next = previous; // null 5 4
            curr.previous = next; // 4 3
            curr = curr.previous; // 4 3
        }
        head = newHead; //
        tail = newTail; // 5
    }
    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head.previous = node;
            head = node;
        }
    }
    public void addLast(int value){
        Node node = new Node();
        node.value = value;
        if(tail == null){
            tail = node;
            head = node;
        }else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }
}
