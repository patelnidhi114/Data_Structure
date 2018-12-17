import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			int array[] = new int[n];
			for(int i =0;i<array.length;i++)
				array[i] =  sc.nextInt();
				arraylen count = new arraylen();
				System.out.println(count.maxLen(array,n));
				T--;
		}
	}
}
class arraylen
{
	int maxLen(int arr[], int n) {
		
//		int len = 0,max=0;
//		for(int j=0; j<n; j++)
//		{
//			int sum = 0;
//		for(int i =j;i<n;i++)
//		{
//			sum += arr[i];
//			len  = i-j+1;
//			if(sum==0 && len > max)
//				max = len;
//		}
//		
//		}
//		return max;
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		int len =0,len1= 0;
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			if(arr[i]==0 && len ==0)
				len = 1;
		    if(sum ==0)
		    	len = i+1;
		    if(map.containsKey(sum))
		    {
		    	len = Math.max(len,i-map.get(sum));
		    }
		    else
		    	map.put(sum,i);
		}
		return len;
	}
	
}
