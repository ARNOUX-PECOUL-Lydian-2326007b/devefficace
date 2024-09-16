package a;

public class SLinkedList {
	private Node head;
	private long size;
	
	public SLinkedList() {
		head = null;
		size = 0;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}
	
	
	public void insert(Node node) {
		if (this.getHead() != node) {
			node.setNext(this.getHead());
			this.setHead(node);
			size +=1 ;
		}
	}
	
	public Node penultieme() {
		Node p = head;
		while(p.getNext().getNext() != null) {
			p = p.getNext();
		}
		return p;
	}
	
	public void invert() {
		Node prec1;
		Node prec2;
		prec1 = head;
		prec2=prec1.getNext();
		Node prec3;
		for (int i = 0 ; i<size-1 ; i+=1) {
			this.insert(prec1);
			prec1 = prec2;
			prec2=prec1.getNext();
		}
	}
}
