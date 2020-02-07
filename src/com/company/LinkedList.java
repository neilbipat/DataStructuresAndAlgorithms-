package com.company;

public class LinkedList {
    LinkedList(){};
    Node head;

    /*Printg Elements in the List*/
    public void printList(){
        Node var = head;
        while(var != null){
            System.out.println(var.data);
            var = var.next;
        }
    }
}


