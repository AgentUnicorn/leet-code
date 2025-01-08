package Array.ContainsNearbyDuplicate;

import java.util.HashMap;

public class ContainsNearbyDuplicateSolution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return false;
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] testcases = {
            {1,2,3,1},
            {1,0,1,1},
            {1,2,3,1,2,3},
            {99,99}
        };

        int[] ks = {
            3,
            1,
            2,
            2
        };
        for (int i = 0; i < testcases.length; i++) {
            boolean result = containsNearbyDuplicate(testcases[i], ks[i]);
            System.out.println(result);
        }
    }
}
