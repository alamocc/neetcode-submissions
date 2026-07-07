class Solution {

        public String encode(List<String> strs) {
    	if(strs.isEmpty()) return "";
    	
    	StringBuilder res = new StringBuilder();
    	List<Integer> sizes = new ArrayList<>();
    	
    	for(String str : strs) {
    		sizes.add(str.length());
    	}
    	
    	for(int size : sizes) {
    		res.append(size).append(";");
    	}
    	
    	res.append("#");
    	
    	for(String str : strs) {
    		res.append(str);
    	}
    	return res.toString();
    }	

    public List<String> decode(String str) {
    	List<String> res = new ArrayList<>();
    	if(str.length() == 0) return res;
    	
    	List<Integer> sizes = new ArrayList<>();
    	
    	int i = 0;
    	while(str.charAt(i) != '#') {
    		StringBuilder aux = new StringBuilder();
    		while (str.charAt(i) != ';') {
    			aux.append(str.charAt(i));
    			i++;	
    		}
    		sizes.add(Integer.parseInt(aux.toString()));
    		i++;
    	}
    	i++;
    	
    	for(int sizeObj : sizes) {
    		StringBuilder subString = new StringBuilder();
    		
    		for(int j = 0; j < sizeObj; j++) {
    			char letter = str.charAt(i + j);
    			subString.append(letter);
    		}
    		res.add(subString.toString());
    		
    		i += sizeObj;
    	}
    	
    	return res;
    }
}
