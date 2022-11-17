package com.linkedlist;

public class LinkedListMain<T> {
	public static void main(String[] args) {
		MyLinkedList<Integer>list = new MyLinkedList<>();
		list.add(70);
		list.add(30);
		list.add(56);
		
//		list.display();
//		System.out.println();
//		list.append(56);
//		list.append(70);
//		list.append(30);
//		list.poplast();
//		list.display();
		if (list.search(30) != null) {
			System.out.println("value found");
		}else {
			System.out.println("value not found");
		}
		
		System.out.println(list.insertAfter(30, 40));
		list.display();
		
	}
}
