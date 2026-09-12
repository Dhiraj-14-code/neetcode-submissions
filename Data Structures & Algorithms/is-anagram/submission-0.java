class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i = 0 ; i < s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            int index1 = ch1-'a';
            int index2 = ch2 -'a';

        count[index1]++;
        count[index2]--;
        }
        for(int i = 0 ; i < 26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    
}
