class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        for(int i=0; i<strs.length; i++){
            if(used[i]) continue;
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            used[i] = true;
            for(int j=i+1; j<strs.length; j++){
                if(!used[j] && isAnagram(strs[i], strs[j])){
                    temp.add(strs[j]);
                    used[j]=true;
                }
            }list.add(temp);
        }return list;
    }
    public boolean isAnagram(String a, String b){
        int[] hash = new int[26];
        if(a.length()!=b.length()) return false;
        for(char c:a.toCharArray()){
            hash[c-'a']++;
        }for(char c:b.toCharArray()){
            hash[c-'a']--;
        }
        for(int i=0; i<hash.length; i++){
            if(hash[i]!=0){
                return false;
            }
        }return true;
    }
}