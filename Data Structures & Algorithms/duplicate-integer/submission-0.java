class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            if(!set.contains(i)){
                set.add(i);
            } else {
                return true;
            }
            
        }
        return false;
        
    }
}