class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int unique = 0;
        for (int i : nums){
            if (map.containsKey(i)){
                int count = map.get(i);
                count++;
                map.put(i,count);
            } else {
                map.put(i,1);
                unique++;
            }
        }
        List<Integer>[]bucket = new List[nums.length+1];
        for ( Map.Entry<Integer,Integer> entry: map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        int[]result = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0&& index < k;i--){
            if (bucket[i] != null){
                for(int num:bucket[i]){
                    result[index] = num;
                    index++;
                    if(index==k) break;
                }
            }
        }

        return result;

        
    }
}
