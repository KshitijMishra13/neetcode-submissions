class Solution {
    public boolean isPalindrome(String s) {
        String[] arr = s.trim().split("\\s+");
        String str = "";
        for(String st:arr){
            for(char c:st.toCharArray()){
                if(Character.isLetterOrDigit(c)){
                    str+=c;
                }
            }
        }str = str.toLowerCase();
        int left = 0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)) return false;
            left++;
            right--;
        }return true;
    }

}
