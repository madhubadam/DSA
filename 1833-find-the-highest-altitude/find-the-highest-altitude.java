class Solution {
    public int largestAltitude(int[] gain) {
        int altitudes=0;
        int maxaltitude=0;
        for(int i:gain){
            altitudes=altitudes+i;
            if(altitudes>maxaltitude){
                maxaltitude=altitudes;
            }
        }
        return maxaltitude;
        
    }
    

}