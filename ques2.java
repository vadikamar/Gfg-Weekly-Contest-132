class Solution{
    public int count101(long n){
        // Code Here
        List<Integer> x=new ArrayList<>();
        int ans=0;
        int c=0;
        while(n!=0)
        {
            if((n&1)==1)
            c++;
            else
            x.add(c);
            n>>=1;
        }
        for(int i:x)
        {
            int l=c-i;
            ans+=(l*i);
        }
        return ans;
    }
}
