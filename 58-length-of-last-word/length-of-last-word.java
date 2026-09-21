class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        String last_word=arr[arr.length-1];
        return last_word.length();
        
    }
}