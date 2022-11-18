package com.linkedlist;

public class OrderedLinkList<T extends Comparable<T>> {

	Node<T> head;
	 Node<T> tail;
	
	public void display() {
		Node<T> tempCurrent = head;
		while (tempCurrent != null) {
			System.out.print(tempCurrent.key+ " ");
			tempCurrent = tempCurrent.next;
		}
	}

	public void add(T key) {
		Node<T> node = new Node<>(key);
		if (head == null) {
			head = node;
			tail = node;
		}
		else if(head.key.compareTo(key)>0) {
			node.next =head;
			head = node;
		}
		else if(tail.key.compareTo(key)<0) {
			tail.next = node;
			tail = node;
		}
		else {
			Node<T> tempPrev = head;
			Node<T> tempCurrent = head.next;
			
			while((tempCurrent != tail) && (tempCurrent.key.compareTo(key) < 0)) {
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
				
			}
			tempPrev.next = node;
			node.next = tempCurrent;
			
		}
	}	
	
}
