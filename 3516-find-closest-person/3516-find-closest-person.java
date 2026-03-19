class Solution 
{
    public int findClosest(int x, int y, int z) 
    {
        int s1 =  Math.abs(x-z);
        int s2 = Math.abs(y-z);
        if(s1>s2)
        return 2;
        else if(s1<s2)
        return 1;
       
       return 0;
        
    }
}