class GFG{
    int k;
    HashMap<String,String> h=new HashMap<>();
    public GFG(int cap){
        // Constructor
        k=cap;
    }
    public boolean judgeOrNot(String submissionId){
        // Complete the function. 
        String n="",t="";
        int f=0;
        for(int i=0;i<submissionId.length();i++)
        {
            if(submissionId.charAt(i)=='@') 
            {
                f=1;
                continue;
            }
            if(f==0)
            n+=submissionId.charAt(i);
            else
            t+=submissionId.charAt(i);
        }
        if(h.containsKey(n))
        {
            int s1=parseTime(t);
            int s2=parseTime(h.get(n));
            if(s1<s2)
            {
                s1+=24*3600;
            }
            int d=s1-s2;
            if(d>=k) {
                h.put(n,t);
                return true;
            }
            else return false;
        }
        else
        {
            h.put(n,t);
            return true;
        }
    }
    public int parseTime(String time)
    {
        String p[]=time.split(":");
        int h=Integer.parseInt(p[0]);
        int m=Integer.parseInt(p[1]);
        int s=Integer.parseInt(p[2]);
        return h*3600+m*60+s;
    }
}
