package singly_list;

import java.util.Objects;

public class ListOperations {

	public static <T> Node<T> addNodeToEnd(Node<T> head, final T data) {
		if(Objects.isNull(head)) {
			head = new Node<T>(data, null);
		} else {
			Node<T> currentNode = head;
			while(Objects.nonNull(currentNode.getNext())) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(new Node<T>(data, null));
		}
		return head;
	}
	
	public static <T> void traverseList(final Node<T> head) {
		if(Objects.isNull(head)) {
			System.out.println("Empty List.");
			return;
		}
		Node<T> currentNode = head;
		while(Objects.nonNull(currentNode))  {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}
	
	public static <T> Node<T> getMiddleNodeInOnePass(final Node<T> head) {
		Node<T> nextNode = head;
		Node<T> middleNode = head;
		int lenght = 0;
	    while(Objects.nonNull(nextNode.getNext())) {
	    	lenght++;
	    	
	    	if(lenght%2==0) {
	    		middleNode = middleNode.getNext();
	    	}
		    nextNode = nextNode.getNext();
	    }
	    return middleNode; 
	}
	
	public static <T> Node<T> deleteNodeWithData(Node<T> head, final T data) {
		if(Objects.isNull(head)) {
			System.out.println("Nothing to delete.");
			return head;
		}
		Node<T> currentNode = head;
		Node<T> previousNode = head;
		while(Objects.nonNull(currentNode)) {
			if(currentNode.getData().equals(data)) {
				if(currentNode.equals(head)) {
					head = head.getNext();
				} else {
					previousNode.setNext(currentNode.getNext());
					currentNode = previousNode;
				}
			}
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		return head;
	}
	
	public static <T> Node<T> reverseLinkedListOnePass(Node<T> head) {
		Node<T> previousNode, currentNode, nextNode;
		previousNode = currentNode = nextNode = head;
		while(Objects.nonNull(currentNode)) {
			nextNode = currentNode.getNext();
			if(currentNode.equals(head)) {
				currentNode.setNext(null);;
			} else {
				currentNode.setNext(previousNode);
			}
			previousNode = currentNode;
			currentNode = nextNode;
		}
		head = previousNode;
		return head;	
	}
}
