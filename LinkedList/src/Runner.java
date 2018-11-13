
public class Runner {
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		list.insert(5);
		list.insert(6);
		list.insertAtStart(3);
		list.insert(8);
		list.insertAt(3,5);
		list.delete(2);
		list.show();
	}


}
