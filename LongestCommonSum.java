import java.util.*;
class LongestCommonSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,len=0,maxlen=0;
		n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++)
		  arr1[i]=sc.nextInt();
		for(int i=0;i<n;i++)
  		 arr2[i]=sc.nextInt();
		for(int i=0;i<n;i++)
 		{
 			int sum1=0,sum2=0;
		 	for(int j=i;j<n;j++)
 			{
				sum1+=arr1[j];
		 		sum2+=arr2[j];
 				if(sum1==sum2)
 				{
 					len=j-i+1;
		 		}
		 		if(len>maxlen)
		   		maxlen=len;
			 }
 		}   
	 	System.out.println(maxlen); 
	}
}
