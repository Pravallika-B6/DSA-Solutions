class ReverseWord {
    public String reverseWords(String s) {
        if(s.length()<0 || s == null) return null;

        String result = s.replaceAll("\\s+", " ");
        String words[] = result.split(" ");

        result = "";
        for(int i = words.length-1; i>=0; i--){
            result += words[i] + " ";
        }

        return result.trim();
    }
}