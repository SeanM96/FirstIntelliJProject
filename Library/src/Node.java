
public class Node {

	int key;
	String name;
	Book b;
	
	Node leftChild;
	Node rightChild;
	
	 Node(int key, String name)
	{
		this.key = key;
		this.name = name;
	}
	 
	public Node (Book b)
	 {
		 this.b = b;
	 }
	
	public String toString()
	{
		return "Book title: " + b.title + " Author: " + b.author + " IBSN: " + b.ISBN + " Book is on loan: " + b.onLoan;
	}

}