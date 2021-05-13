import java.util.*;
class Equilibrium
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		  sum+=arr[i];	
		 }  
		 int ls=0,rs=0;
		for(int i=0;i<n;i++)
		{
			sum-=arr[i];
			if(ls==sum)
			  System.out.println(i+1);
			else
			  ls+=arr[i];  
		}
	}
}
