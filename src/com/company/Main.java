package com.company;

public class Main {

    public static void main(String[] args) {
	LinkedList linkedList = new LinkedList();

	    /*Creating the Head Node*/
        Node first = new Node(1);
        linkedList.head = first;

        /*Creating other Nodes*/
        Node second = new Node(2);
        Node third = new Node(3);

        /*Conecting the nodes*/
        linkedList.head.next = second;
        second.next = third;

        /*Printing the List*/
        linkedList.printList();
        System.out.println("=========");

        /*Adding to End of List*/
        linkedList.addToEndOfList(4);
        linkedList.printList();
        System.out.println("=========");

        /*When Testing one delete function, the others should be commented out*/

        /*Delete End of a List*/
        linkedList.deleteEndOfList();
        linkedList.printList();
        System.out.println("=========");

        /*Delete First of a List*/
        linkedList.deleteFirst();
        linkedList.printList();
        System.out.println("=========");

        /*Delete Anywhere in the List*/
        linkedList.delete(4);
        linkedList.printList();
        System.out.println("=========");


    }

}
