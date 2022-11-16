package com.linkedlist;

public class MyLinkedList<T> {

	Node<T> head;
	Node<T> tail;
	
	
	public void display() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.key+ " ");
			temp = temp.next;
		}
	}
	
	public void add(T key) {
		Node<T> node = new Node<>(key);
		if (head == null) {
			head = node;
			tail = node;
		}else {
			node.next = head;
			head = node;
		}
	}
	
	public void append(T key) {
		Node<T> node = new Node<> (key);
		if (head == null) {
			head = node;
			tail = node;
		}else {
			tail.next = node;
			tail = node;
		}
	}
	
	public void insert(T key) {
		Node<T> node = new Node<> (key);
		head.next = node;
		node.next = tail;
	}
	
}	
	
	




