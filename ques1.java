class Solution {
    public int antiqueItems(int n, int items[], int price[]){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(items[i]))
            h.put(items[i],Math.min(price[i],h.get(items[i])));
            else
            h.put(items[i],price[i]);
        }
        //System.out.println(h);
        int s=0;
        for(int i:h.keySet())
        s+=h.get(i);
        return s;
    }
}
