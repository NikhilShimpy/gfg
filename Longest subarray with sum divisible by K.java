// User function Template for Java

class Solution {
    int longestSubarrayDivK(int[] a, int k) {
        // Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        long sum=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i]; // X
            int rem = (int)(sum%k);
            if(rem<0){
                rem = rem + k;
            }
            if(map.containsKey(rem)){
                int len = i - map.get(rem); 
                max = Math.max(max,len);
            }else{
                map.put(rem,i);
            }
        }
        return max;
    }
}
