import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        if(list.size()<3){
            return list.get(0);
        }
        return list.get(2);
        
    }
}