
public class LinkedList {
	
	Node head ;
	
	
	public void show()
	{
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	public void insert(int data) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		if(head == null)
		{
			head = node;
		}
		else
		{
			while(n.next!=null)
				n = n.next;
			n.next = node;
		}
	}
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node; 
	}
	public void insertAt(int index,int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		for(int i =0;i<index-1;i++)
		{
			n = n.next;
		}
		 node.next = n.next;
		 n.next = node;
	}
	public void delete(int index)
	{
		if(index == 0)
		{
			head.next = head;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i =0;i<index-1;i++)
			{
				n = n.next;
				
			}
			n1 = n.next;
			n.next = n1.next ;
		}
	}

}
