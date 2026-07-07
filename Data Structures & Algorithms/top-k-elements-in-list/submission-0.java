class Solution {
    public int[] topKFrequent(int[] nums, int k) {
		
		// key -> numero; value -> frecuencia
		Map<Integer, Integer> acum = new HashMap<>();
		List<List<Integer>> freq = new ArrayList<>();
		
		for (int i = 0; i <= nums.length; i++) {
            freq.add(new ArrayList<>());
        }

		
		for(int num : nums) {
			if(!acum.containsKey(num)) {
				acum.put(num, 0);
			}
			acum.put(num, acum.get(num)+1);
		}
		
		// Para cada entrada en el map: 
		for(Map.Entry<Integer, Integer> entry : acum.entrySet()) {
			freq.get(entry.getValue()).add(entry.getKey());
		}
		
		int[] res = new int[k];
		int index = 0;
		for(int i = freq.size() - 1; i > 0 && index < k; i--) {
			for(int n : freq.get(i)) {
				res[index] = n;
				index++;
				if(index == k) return res;
			}
		}
		
		return res;
    }
}
