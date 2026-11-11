class Solution {
    public int[] getConcatenation(int[] nums) {
        //So for this I need to attach 2 arrays of the same array. 
        //The first thought that comes to mind is to make 2n array and 
        //loop it n times so it stores the supposed number in the first position
        //as well as the 2nd n+l position at the same time

        //first create a variable l to store the length
        int l = nums.length;

        //then create an array of 2l
        int[] ans = new int[2*l];

        //Loop 
        for(int i=0; i<l; i++){
            ans[i]=ans[i+l]= nums[i];
        }

        //return the ans
        return ans;
    }
}