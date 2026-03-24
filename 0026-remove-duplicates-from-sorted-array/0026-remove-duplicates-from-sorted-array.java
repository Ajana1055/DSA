class Solution {
    public int removeDuplicates(int[] nums) {

        int cnt=1;
        int p=nums[0];
        for(int i=1;i<nums.length;i++){
      
        if(p!=nums[i]) {
            p=nums[i];
            nums[cnt]=p;
            cnt++;
        }
        
        }
        return cnt;
    }
}