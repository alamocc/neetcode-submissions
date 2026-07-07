class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       		Map<String, List<String>> res = new HashMap<>();
		
		for(int i = 0; i < strs.length; i++) {
			int[] count = new int[26];
			char[] charArray = strs[i].toCharArray();
			
			for(int j = 0; j < charArray.length; j++) {
				count[charArray[j] - 'a']++;
			}
			String key = Arrays.toString(count);
			if(!res.containsKey(key)) {
				res.put(key, new ArrayList<>());
			}
			res.get(key).add(strs[i]);
			
		}
		return new ArrayList<>(res.values()); 
    }
}
