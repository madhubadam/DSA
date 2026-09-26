class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int freq=map.values().iterator().next();
        for(int c:map.values()){
            if(freq!=c){
                return false;
            }
        }
        return true;
        
    }
}