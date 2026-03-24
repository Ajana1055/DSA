class Solution {
    public int trap(int[] height) {
        int res=0;

        int l=1;
        int r=height.length-2;
        int lmax=height[l-1];
        int rmax=height[r+1];

        while(l<=r){
            if(rmax<=lmax){
            res+=Math.max(0,rmax-height[r]);
             rmax=Math.max(rmax,height[r]);
             r--;
            }
            else{
                res+=Math.max(0,lmax-height[l]);
               
             lmax=Math.max(lmax,height[l]);
             l++;
            }
        }
        
        return res;
    }
}