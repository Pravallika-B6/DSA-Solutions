class Solution {
    public int longestPalindrome(String s) {
        if(s == null) return 0;
        if(s.length() == 1) return 1;

        HashSet<Character> set = new HashSet<>();
        int result = 0;

        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                result +=2;
            }else{
                set.add(c);
            }
        }

        if(set.size() > 0) result +=1;

        return result;
    }
}