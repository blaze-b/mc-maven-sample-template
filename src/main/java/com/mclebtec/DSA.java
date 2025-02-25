package com.mclebtec;

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  private Node head;


  public LinkedList() {
    this.head = null;
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public void append(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
       head = newNode;
       return;
    }
    Node lastNode = head;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
    }
    lastNode.next = newNode;
  }

  public void prepend(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public void insertAt(int position, int data) {
    if (position < 0) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }

    if (position == 0) {
      prepend(data);
      return;
    }


  }
}



public class DSA {




}
