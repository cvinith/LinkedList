package com.linkedlist;

public class LinkedList {

  private class Node{
    int data;
    Node link;
    Node(int data){
      this.data = data;
    }
  }

  Node head =null;

  //Function to add a  node to end of list
  public void add(int data){
    Node newNode = new Node(data);
    if(head == null)
      head = newNode;
    else{
      Node temp = head;
      while(temp.link != null){
        temp = temp.link;
      }
      temp.link = newNode;
    }
  }

  //Function to add a node at specified position
  public void add(int position,int data){
    Node newNode = new Node(data);
    int length =length();
    if(position !=0 && position >= length)
      throw new RuntimeException();
    else{
     Node prev = null,current = head;
     int i=0;
     while(i < position){
       prev = current;
       current = current.link;
       i++;
     }
     if(prev == null){
       newNode.link = head;
       head = newNode;
     }
     else{
       newNode.link = current;
       prev.link = newNode;
     }
    }
  }

  //Finction to find length of list
  public int length(){
    Node temp = head;
    int count = 0;
    while(temp != null){
      count++;
      temp = temp.link;
    }
    return count;
  }

  //Function to add node at the beginnig
  public void addBegin(int data){
    Node newNode = new Node(data);
    if(head == null)
      head = newNode;
    else{
      newNode.link = head;
      head = newNode;
    }
  }

  //Function to reverse the list
  public void reverse(){
    if(head == null || head.link == null)
      return;
    else{
      Node prev = null,current = head,next = null;
      while(current != null){
        next = current.link;
        current.link = prev;
        prev = current;
        current = next;
      }
      head = prev;
    }
  }

  // Function to print all elements in list
  public void print(){
    Node temp = head;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.link;
    }
  }

  //Function to remove last Node in list
  public void removeLast(){
    if(head == null || head.link == null)
      head = null;
    else{
      Node temp = head;
      while(temp.link.link != null)
        temp = temp.link;
      temp.link =null;
    }
  }

  //Function to remove first node in list
  public void removeFirst(){
    if(head == null)
      return;
    else
      head = head.link;
  }

  //Function to remove node at specified position
  public void remove(int position){
    int length = length();
    if(length == 0 || position >= length)
      throw new RuntimeException("index position does not exists");
    else{
      int i=0;
      Node prev = null,current = head;
      while(i < position){
        prev = current;
        current = current.link;
        i++;
      }
      if(prev == null)
        head = head.link;
      else{
        prev.link = current.link;
      }
    }
  }

  //To remove all nodes in a list
  public void clear(){
    head = null;
  }


  @Override
  public String toString() {
    Node temp = head;
    StringBuffer list = new StringBuffer();
    list.append("[");
    while(temp != null){
      list.append(temp.data);
      list.append(" ");
      temp = temp.link;
    }
    list.append("]");
    return list.toString();
  }

}
