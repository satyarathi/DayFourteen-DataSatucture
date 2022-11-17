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

	T pop() {
		T deleteElement = head.key;
		head = head.next;
		return deleteElement;
	}

	T poplast() {
		T deleteElement = tail.key;
		Node<T> temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = null;
		temp = tail;
		return deleteElement;
	}

	public Node<T> search(T key){
		Node<T> temp = head;
		while (temp != null) {
			if (temp.key.equals(key))
				return temp;
			temp = temp.next;
		}
		return null;
	}

	public boolean insertAfter(T searchData, T insertData) {
		Node<T> insertnode = new Node<> (insertData);
		Node<T> searchedNode = new Node<> (searchData);
		if(searchData != null) {
			insertnode.next = searchedNode.next;
			searchedNode.next = insertnode;
			return true;
		}
		return false;
	}

	public void popElement(T key) {
		Node<T> searchedNode = search(key);
		Node<T> temp = head;
		while(temp.next != searchedNode) {
			temp = temp.next;
		}
		temp.next = searchedNode.next;
	}

	public int size() {
		int count = 0;
		Node<T> temp = head;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}



}	







