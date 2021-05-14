#include <iostream>
using namespace std;
long long int N=1000001;
long long int seive[1000001];
void gen_modifiedsieve()
{
    seive[0]=seive[1]=1;
    for(int i=2;i<=N;i++)seive[i]=i;
    for(int i=2;i*i<=N;i++)
    {
        if(seive[i]==i)
        {
            for(int j=i*i;j<=N;j+=i)
            {
                if(seive[j]==j)
                {
                    seive[j]=i;
                }
            }
        }
    }
    
}

int main() 
{
	gen_modifiedsieve();
	int q;
	cin>>q;
	while(q--)
	{
		int l,r;
		cin>>l>>r;
		int sum=0;
		if(l==1)l++;
		while(l<=r)
		{
			if(seive[l]==l)
			 sum=sum+seive[l];
			l++; 
		}
		cout<<sum<<"\n";
	    
	}
	return 0;
}
