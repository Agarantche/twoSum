class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums.length; ++i){
            for (int j = i + 1; j < nums.length; ++j)
            if (nums[i] + nums[j] == target){
                result.add(i);
                result.add(j);
            }
        }
        
        Integer[] resultArray = result.toArray(new Integer[0]);

           int[] intArray = new int[resultArray.length];
           for (int i = 0; i < resultArray.length; i++) {
               intArray[i] = resultArray[i];
           }
        
        return intArray;

    }
}
