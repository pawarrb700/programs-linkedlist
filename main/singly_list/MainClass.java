package singly_list;

import java.util.LinkedList;
import java.util.Scanner;

public class MainClass {
	
	private static Node<Integer> linkedList;
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Options :\n1.Insert into list.\n2.Traverse list.\n3.Middle Node. "
					+ "\n4.Delete Node with data. \n5 Reverse linked list. "
					+ "\n6.Exit");
			System.out.println("Please Enter your option :");
			int option = scanner.nextInt();
			if(option > 5) {
				break;
			}
			switch(option) {
				case 1 :
					System.out.println("Number of elements to be added :");
					int numberOfElement = scanner.nextInt();
					while(numberOfElement-- > 0) {
						System.out.println("Element to add : ");
						linkedList = ListOperations.addNodeToEnd(linkedList, scanner.nextInt());
					}
					break;
				case 2 :
					ListOperations.traverseList(linkedList);
					break;
				case 3 :
					Node<Integer> middleNode = ListOperations.getMiddleNodeInOnePass(linkedList);
					System.out.println(middleNode.getData());
					break;
				case 4 :
					System.out.println("Enter data to delete :");
					linkedList = ListOperations.deleteNodeWithData(linkedList, scanner.nextInt());
					break;
				case 5 :
					linkedList = ListOperations.reverseLinkedListOnePass(linkedList);
					break;
			}
		}
	}			
}
