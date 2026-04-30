class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            int[] anagram = new int[26];
            
            for (char c : strs[i].toCharArray()){
                anagram[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 26; j++){
                sb.append(anagram[j]);
                sb.append('#');
            }
            String key = sb.toString();

            if (map.containsKey(key)){
                List<String> s = map.get(key);
                s.add(strs[i]);
            } else {
                List<String> s = new ArrayList<>();
                s.add(strs[i]);
                map.put(key,s);
            }

        }
        return new ArrayList<>(map.values());
        
        
    }
}
