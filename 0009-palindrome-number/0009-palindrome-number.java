class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int p=0;
        int x1=x;
        while(x>0){
            p= 10*p+(x%10);
            x/=10;
        }
        if(x1==p) return true;
        else return false;
    }
}