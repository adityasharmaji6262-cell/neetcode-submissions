class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean hasduplicate = false;
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int i: map.keySet()){
            if(map.get(i)>1){
                hasduplicate = true;
            }
        }
        if(hasduplicate){
            return true;
        }
        return false;
    }
}