import java.util.*;
class TestClass
{
    static int n=1001;
    static int seive[]=new int[1002];
    static void genSeive()
    {
	System.out.println("seive started");
        for(int i=0;i<n;i++)
         seive[i]=1;
         seive[0]=0;
         seive[1]=0;
        for(int i=2;i*i<n;i++)
        {
            if(seive[i]==1)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    seive[j]=0;
                }
            }
        } 
    }
    public static void main(String args[] ) 
    {
        Scanner sc=new Scanner(System.in);
	System.out.println("main started");
        genSeive();
	System.out.println("after gensieve");
        int x=sc.nextInt();
        int count=0;
        for(int i=1;i<=x;i++)
        {
            if(seive[i]==1)
             count++;
        }
	System.out.print(count);
        
    }
}
