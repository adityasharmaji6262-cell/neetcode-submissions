class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int count =0;
        int left = 0;
        for(int right=0; right<s.length(); right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            count = Math.max(count, right-left+1);
        }
        return count;
    }
}
