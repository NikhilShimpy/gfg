class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1); 
        int sum=0,max=0;
        for(int i=0;i<arr.length;i++){
            sum = (arr[i]==0)?(sum-1):(sum+1);
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                max = Math.max(max,len);
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
