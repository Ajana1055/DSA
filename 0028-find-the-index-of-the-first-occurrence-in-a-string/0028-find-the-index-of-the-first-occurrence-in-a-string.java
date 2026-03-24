class Solution {
    public int strStr(String haystack, String needle) {
    
        int m=haystack.length();
        int n=needle.length();
        if(n>m) return -1;
        m-=n;

        for(int i=0;i<=m;i++){
            
                if(haystack.substring(i,i+n).equals(needle)) 
                return i;
            
        }
        return -1;
    }
}