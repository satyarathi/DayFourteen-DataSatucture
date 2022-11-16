package com.linkedlist;

public class LinkedListMain<T> {
	public static void main(String[] args) {
		MyLinkedList<Integer>list = new MyLinkedList<>();
//		list.add(70);
//		list.add(30);
//		list.add(56);
//		System.out.println();
		list.append(56);
		list.append(70);
		list.insert(30);
		list.display();
	}
}
