#include<iostream>
#include<bits/stdc++.h>
using namespace std;
void array_reverse(int i,int n,int a[])
{
	
	if(i>(n-1-i))
	  return;
	else
	  swap(a[i],a[n-1-i]);
	  array_reverse(i+1,n,a);
}
int main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	array_reverse(0,n,arr);
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}
	return 0;
}
