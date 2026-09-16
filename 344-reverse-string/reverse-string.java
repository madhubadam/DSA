class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int right=0;
        int left=n-1;
        while(right<=left){
            char temp=s[right];
            s[right]=s[left];
            s[left]=temp;
            right++;
            left--;
        }
        //return s;
        
    }
}