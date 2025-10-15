//package com.example.LinkedLists;

import java.util.*;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private Node3 tail;

    // Insert at Front
    public void insertAtFront(int data) {
        Node3 newNode = new Node3(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        System.out.println(data + " inserted at the front.");
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node3 newNode = new Node3(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(data + " inserted at the end.");
    }

    // Delete from Front
    public void deleteFromFront() {
        if (tail == null) {
            System.out.println("List is empty, cannot delete.");
            return;
        }
        Node3 head = tail.next;
        if (head == tail) {
            System.out.println(head.data + " deleted from front.");
            tail = null;
        } else {
            System.out.println(head.data + " deleted from front.");
            tail.next = head.next;
        }
    }

    // Delete from End
    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty, cannot delete.");
            return;
        }
        Node3 temp = tail.next;
        if (temp == tail) {
            System.out.println(temp.data + " deleted successfully.");
            tail = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            System.out.println(tail.data + " deleted successfully.");
            temp.next = tail.next;
            tail = temp;
        }
    }

    // Display
    public void display() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Circular linked list: ");
        Node3 temp = tail.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println();
    }

    // Search
    public void search(int key) {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node3 temp = tail.next;
        do {
            if (temp.data == key) {
                System.out.println(key + " found in the list.");
                return;
            }
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println(key + " not found in the list.");
    }

    // Main demo class
    public static class CircularLinkedListDemo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            CircularLinkedList cll = new CircularLinkedList();

            int choice;
            do {
                System.out.println("\nCircular Linked List Operations:");
                System.out.println("1. Insert at Front");
                System.out.println("2. Insert at End");
                System.out.println("3. Delete from Front");
                System.out.println("4. Delete from End");
                System.out.println("5. Display");
                System.out.println("6. Search");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter data to insert at front: ");
                        int frontData = sc.nextInt();
                        cll.insertAtFront(frontData);
                        break;

                    case 2:
                        System.out.print("Enter data to insert at end: ");
                        int endData = sc.nextInt();
                        cll.insertAtEnd(endData);
                        break;

                    case 3:
                        cll.deleteFromFront();
                        break;

                    case 4:
                        cll.deleteFromEnd();
                        break;

                    case 5:
                        cll.display();
                        break;

                    case 6:
                        System.out.print("Enter key to search: ");
                        int key = sc.nextInt();
                        cll.search(key);
                        break;

                    case 7:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 7);

            sc.close();
        }
    }
}
