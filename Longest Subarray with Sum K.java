// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int max = 0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            int rem = sum-k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                max = Math.max(max,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
    }
}
