import java.util.*;
class SubArrayDiv
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,res=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
		int k;
		k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum+=arr[j];
				if(sum%k==0)
				  res++;
			}
		}
		System.out.println(res);
	}
}
