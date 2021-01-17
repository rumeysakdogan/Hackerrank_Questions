package DataStructures.LinkedList;

/*
    We need a class node that takes in, has a next value, and a data,
    and then just to make our lives easier we'll add in a constructor and set that value.
     */
public class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }

}