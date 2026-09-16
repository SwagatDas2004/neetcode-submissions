

class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            if(set.add(i)) set.add(i);
            else return true;
        }

        return false;
    }
}