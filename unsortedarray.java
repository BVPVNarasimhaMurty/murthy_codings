import java.util.*;
class LongestArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,l,r;
		n=sc.nextInt();
		l=n;r=0;
		int arr[]=new int[n];
		int s[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			s[i]=arr[i];
		}
		Arrays.sort(s);	 
	 	for(int i=0;i<n;i++)
	 	{
	 		if(arr[i]!=s[i])
	 		{
	 			if(i<l)
	 			l=i;
	 			if(i>r)
	 			r=i;
		 	}
	  	}	 
	 	if(r-l>=0)
	  		System.out.println(r-l+1);
		else
	   		System.out.println("0");

	}
}
