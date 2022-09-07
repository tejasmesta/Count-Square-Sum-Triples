class Solution {
    public int countTriples(int n) {
        int ans = 0;
        
        for(int a=1;a<n;a++)
        {
            for(int b=a+1;b<=n;b++)
            {
                int sq = (a*a) + (b*b);
                double sqrt = Math.sqrt(sq); 
                if(sqrt>n)
                {
                    break;
                }
	            else if((sqrt - Math.floor(sqrt)) == 0)
                    ans++;                
            }
        }
        
        return ans*2;
    }
}
