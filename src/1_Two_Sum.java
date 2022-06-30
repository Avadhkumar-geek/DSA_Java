import java.util.*;

class Leetcode_1 {
    public int[] twoSum(int[] nums, int target) {
        Map< Integer, Integer > map = new HashMap< >();

        for (int i = 0; i < nums.length; i++) {

            int rem = target - nums[i];

            if (map.containsKey(rem)) {

                return new int[] {
                    map.get(rem), i
                };

            }

            map.put(nums[i], i);

        }
        throw new IllegalArgumentException("");
    }
}
