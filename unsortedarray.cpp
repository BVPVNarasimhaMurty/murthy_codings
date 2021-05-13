#include<bits/stdc++.h>

using namespace std;
int main()
{
	int n,l,r;
	cin>>n;
	l=n,r=0;
	int arr[n],s[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
		s[i]=arr[i];
	}
     sort(s,s+n);	 
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
	  cout<<r-l+1;
	   else
	   cout<<"0";
	 return 0;
}
