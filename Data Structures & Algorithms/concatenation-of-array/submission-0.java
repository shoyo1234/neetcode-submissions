class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] n_array = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            n_array[i] = nums[i];
            n_array[i + nums.length] = nums[i];
        }

        return n_array;
    }
}
