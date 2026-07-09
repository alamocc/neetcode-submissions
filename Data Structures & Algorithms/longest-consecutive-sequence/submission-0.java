class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int longest = 0;
        
        for(int num : nums) {
        	numSet.add(num);
        }
        
        for(int num : nums) {
        	int streak = 0, curr = num;
        	
        	while(numSet.contains(curr)) {
        		streak++;
        		curr++;
        	}
        	longest = Math.max(streak, longest);
        }
        return longest;
    }
}
