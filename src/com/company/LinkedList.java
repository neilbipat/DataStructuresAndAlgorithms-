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

    /*Adding Nodes to the end of the list*/
    public void addToEndOfList(int data){
        Node var = new Node(data);
        if(head == null){
            head = var;
        } else {
            Node last = head;

            while(last.next != null){
                last = last .next;
            }
            last.next = var;
        }
    }




}


