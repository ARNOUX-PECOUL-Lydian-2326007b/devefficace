package a;

public class ListeMain {
	public static void main (String[] args) {
		
		Node c = new Node(9);
		Node b = new Node(6, c);
		Node a = new Node(3, b);
		
		Node d = new Node(12);
		c.setNext(d);

		b.setElement(455);
		
		System.out.println(c.getNext());
		
		SLinkedList liste = new SLinkedList();
		
		liste.setHead(a);
		liste.setSize(4);
		
		Node j = new Node(98998);
		liste.insert(j);
		

		System.out.println(a.toString());
		
		System.out.println(liste.getHead());
		
		System.out.println(j.toString());
		
		System.out.println(liste.getSize());
		
		System.out.println(liste.penultieme());
		
		liste.invert();
		
		System.out.println(liste.getHead());
		
		System.out.println(a);
	}
}