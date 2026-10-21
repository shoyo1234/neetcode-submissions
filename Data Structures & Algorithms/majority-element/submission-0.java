
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int check = nums.length/2;
        for(int key : map.keySet()){
            if(map.get(key) > check){
                return key;
            }
        }
        return -1;
    }
}