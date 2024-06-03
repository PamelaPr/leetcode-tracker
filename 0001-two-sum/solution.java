class Solution {
    public int[] twoSum(int[] nums, int target) {
    //    if( int[0] + int[0+i] == 9){
    //     System.out.println("int[]")
    //    }
    for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
