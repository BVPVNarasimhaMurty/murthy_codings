class Solution 
{
    public int countPrimes(int n)
    {
        if (n <= 2)
        {
            return 0;
        }
        
        int numbers[] = new int[n];
        for (int i = 2; i*i <= n; i++) 	
	      {
            if (numbers[i] == 0)
	          {
                for (int j = i*i; j < n; j += i) 
	              {
                    numbers[j] = 1;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++)
        {
            if (numbers[i] == 0) 
            {
                count++;
            }
        }
       return count;
    }
}
