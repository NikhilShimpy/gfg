class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            
            int sv = target-arr[i];
            
            res+=map.getOrDefault(sv,0);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return res;
    }
}
