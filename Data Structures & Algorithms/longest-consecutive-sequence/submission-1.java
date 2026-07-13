class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashMap<Integer, Boolean> map = new HashMap<>();
        int longestlen = 1;
        for(int num : nums){
            map.put(num,Boolean.FALSE);
        }

        for(int num:nums){
            int currlength = 1;
            int nextnum = num+1;
            while(map.containsKey(nextnum) && map.get(nextnum)==false){
                currlength+=1;
                map.put(nextnum, Boolean.TRUE);
                nextnum++;
            }
            

            int prevnum = num-1;
            while(map.containsKey(prevnum) && map.get(prevnum)==false){
                currlength+=1;
                map.put(prevnum, Boolean.TRUE);
                prevnum--;
            }
            

            longestlen = Math.max(longestlen, currlength);
        }
        return longestlen;
    }
}
