import java.util.*;
import java.lang.*;
class Blondie
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t>0)
		{
			int n;
			n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{	
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				if(arr[i]==-1)
				{
					int sum=0;
					for(int j=0;j<i;j++)
					{
						sum+=arr[j];
					}
					int val=sum/i;
					arr[i]=val;
				}
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
			t--;
		}
	}
}
						
