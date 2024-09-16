package a;

public class Node {
	private int element;
	private Node next;
	
	public Node(int s) {
		element = s;
		next = null;
	}
	
	public Node(int s, Node n) {
		element = s;
		next = n;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [element=" + element + ", next=" + next + "]";
	}
}
