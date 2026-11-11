class Solution {
    public boolean hasDuplicate(int[] nums) {
        //For this one if i remember correctly Hashset is the solution
        //You enter the array in HashSet and if the entering turns false you return
        //True for contains duplicate

        //Make Hashset
        HashSet<Integer> hset = new HashSet<>();

        //Enter numbers through loop and try to enter it into the set
        for(int i=0;i<nums.length;i++){
            if(!(hset.add(nums[i]))) return true;
        }

        //if the loop completes wihout returning true then it has no duplicates
        //hence return false
        return false;
    }
}