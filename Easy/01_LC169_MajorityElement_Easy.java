class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int cand=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];

        if(count==0){
            cand=num;
        }    
        if(num==cand){
            count++;
        }
        else{
            count--;
        } 
        }
    return cand;
    }
}