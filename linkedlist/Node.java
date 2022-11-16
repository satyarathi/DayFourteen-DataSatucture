package com.linkedlist;

public class Node<T> {

	T key;	
	Node<T>next ;
	Node(T key){
		this.key = key;
		next = null;
	}
}
