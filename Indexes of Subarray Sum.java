class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> myMap = new HashMap<>();
        myMap.put(0, -1);
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int rem = sum - k;
            if (myMap.containsKey(rem)) {
                int start = myMap.get(rem) + 1;
                list.add(start + 1); 
                list.add(i + 1);
                return list;
            }

            if (!myMap.containsKey(sum)) {
                myMap.put(sum, i);
            }
        }

        list.add(-1);
        return list;
    }
}
