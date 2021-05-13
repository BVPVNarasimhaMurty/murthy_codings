import java.util.*;
class TestClass
{
    public static void main(String args[] ) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
           if(isPrime(i)==1)
           System.out.print(i+" ");
        }
        
      
    }
    static int isPrime(int n)
    {
        if(n<=1)
         return 0;
        for(int i=2;i<n;i++)
         if(n%i==0)
          return 0;
        return 1;
        
    }
}
