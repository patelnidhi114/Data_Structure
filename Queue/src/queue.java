import java.io.BufferedReader ;
import java.io.InputStreamReader;
import java.util.*;

class queue{
	
	static int count = 0,front=0,rear=0,element ;
	
	public static void enque(int queue[],int n2)
	{
		    queue[rear] = n2;
			rear ++;
			count = count + 1 ;
	}
	public static void deque(int queue[] )
	{
		if(rear == front)
			System.out.print("-1"+ " ");
		else 
		{
			System.out.print(queue[front]+ " ");
			queue[front] = 0;
			front = front + 1;
			count = count -1 ;
		}
	}
	
	public static int fetch(int queue[],int front)
	{
		return queue[front];
	}
	public static void main(String args[]) throws Exception 
	{
		Scanner br =  new Scanner(System.in);
		int n = br.nextInt();
		int i=0,arraysize=100;
		int [] queue = new int[n];
		
		while(i<n)
		{
			String n1 = br.next();
			if(n1.equalsIgnoreCase("E"))
			{
				
				int n2 = br.nextInt();
				enque(queue,n2);
				System.out.println(count);
			}
			else
			{
				deque(queue);
				System.out.println(count);
			}
			i++;
		}
		br.close();
	}
}

