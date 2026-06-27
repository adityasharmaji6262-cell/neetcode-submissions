class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> freqstrmap = new HashMap<>();
        for(String str:strs){
            String freqstr = getfreqstr(str);
            if(freqstrmap.containsKey(freqstr)){
                freqstrmap.get(freqstr).add(str);
            }else{
                List<String> Strlist = new ArrayList<>();
                Strlist.add(str);
                freqstrmap.put(freqstr, Strlist);
            }
        }
        return new ArrayList<>(freqstrmap.values());
    }
    private String getfreqstr(String str){
        int[] count = new int[26];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)-'a']++;
        }
        StringBuilder freqstr = new StringBuilder("");
        char ch = 'a';
        for(int i:count){
            freqstr.append(ch);
            freqstr.append(i);
            ch++;
        }
        return freqstr.toString();
    }
}
