package com.linkedlist;

public class StackMain {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(70);
		stack.push(30);
		stack.push(56);
		
		stack.pop();
		stack.print();
		System.out.println( stack.peek());
        System.out.println();
		System.out.println();

////		while(!stack.isEmpty()){
////			System.out.println(stack.peek());
////			stack.pop();
////			stack.print();
////			System.out.println();
//		}

	}
}