class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<=right){
             if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
               
            }
            else{
              return false;
            }
        }
        return true;
        
    }
}