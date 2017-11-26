
public class BinTree {

	Node root;
	
	public void addNode(int key, String name)
	{
		Node newNode = new Node(key, name);
					
					if (root == null)
					{
						root = newNode;
					}
					else
					{
						Node currentNode = root;
						Node parent;
						
						while(true)
						{
						parent = currentNode;
						
						if(key < currentNode.key)
						{
							currentNode = currentNode.leftChild;
							
							if (currentNode == null)
							{
								parent.leftChild = newNode;
								return;
							}
						}
						else
						{
							currentNode = currentNode.rightChild;
							
							if (currentNode == null)
							{
								parent.rightChild = newNode;
								return;	
							}
						}
						}
					}
				
	}

	public void addBook(String title, String author, int ISBN)
	{
		Book b = new Book(title, author, ISBN);
		Node newNode = new Node(b);
					
					if (root == null)
					{
						root = newNode;
					}
					else
					{
						Node currentNode = root;
						Node parent;
						
						while(true)
						{
						parent = currentNode;
						
						if(ISBN < currentNode.b.ISBN)
						{
							currentNode = currentNode.leftChild;
							
							if (currentNode == null)
							{
								parent.leftChild = newNode;
								return;
							}
						}
						else
						{
							currentNode = currentNode.rightChild;
							
							if (currentNode == null)
							{
								parent.rightChild = newNode;
								return;	
							}
						}
						}
					}
				
	}

	public void inOrderTraverseTree(Node currentNode)
	{
		if (currentNode != null)
		{
			inOrderTraverseTree(currentNode.leftChild);
			System.out.println(currentNode);
			inOrderTraverseTree(currentNode.rightChild);
		}
		
	}

	public void preOrderTraverseTree(Node currentNode)
	{
		if (currentNode != null)
		{
			System.out.println(currentNode);
			preOrderTraverseTree(currentNode.leftChild);
			preOrderTraverseTree(currentNode.rightChild);
		}	
	}

	public void postOrderTraverseTree(Node currentNode)
	{
		if (currentNode != null)
		{
			postOrderTraverseTree(currentNode.leftChild);
			postOrderTraverseTree(currentNode.rightChild);
			System.out.println(currentNode);
		}	
	}

	public Node findNode(int key)
	{
		Node currentNode = root;
		
		while(currentNode.key != key)
		{
			if (key < currentNode.key)
			{
				currentNode = currentNode.leftChild;
			}
			else
			{
				currentNode = currentNode.rightChild;
			}
			
			if (currentNode == null)
			{
				return null;
			}
		}
		return currentNode;
	}
	
	public Node findBook(int ISBN)
	{
		Node currentNode = root;
		
		while(currentNode.b.ISBN != ISBN)
		{
			if (ISBN < currentNode.b.ISBN)
			{
				currentNode = currentNode.leftChild;
			}
			else
			{
				currentNode = currentNode.rightChild;
			}
			
			if (currentNode == null)
			{
				return null;
			}
		}
		return currentNode;
	}
	
	public void loanBook(int ISBN)
	{
		Node currentNode = root;
		
		while(currentNode.b.ISBN != ISBN)
		{
			if (ISBN < currentNode.b.ISBN)
			{
				currentNode = currentNode.leftChild;
			}
			else
			{
				currentNode = currentNode.rightChild;
			}
			
			if (currentNode == null)
			{
				return;
			}
		}
		if (currentNode.b.onLoan == false)
		{
		currentNode.b.onLoan = true;
		}
		else
		{
			currentNode.b.onLoan = false;
		}
	}
}
