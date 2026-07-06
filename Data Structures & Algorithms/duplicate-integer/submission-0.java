class Solution {
    public boolean hasDuplicate(int[] nums) {
        		Set<Integer> acum = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (acum.contains(nums[i])) {
				return true;
			}
			acum.add(nums[i]);
		}
		return false;
    }
}