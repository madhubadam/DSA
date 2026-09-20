class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i+=k*2){
            int left=i;
            int right=Math.min(i+k-1,arr.length-1);
            while(left<=right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

        }
        return new String(arr);
    }
}