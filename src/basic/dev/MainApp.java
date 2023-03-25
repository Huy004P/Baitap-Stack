package basic1.dev;

import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println("Original stack: " + stack);
		
		Stack<Integer> reversedStack = new Stack<>();
		while (!stack.isEmpty()) {
			reversedStack.push(stack.pop());
		}
		System.out.println("Reversed stack: " + reversedStack);

	}

}
