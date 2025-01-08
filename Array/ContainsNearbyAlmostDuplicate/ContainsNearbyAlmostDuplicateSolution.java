package Array.ContainsNearbyAlmostDuplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class ContainsNearbyAlmostDuplicateSolution {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (nums == null || nums.length == 0) return false;
        int n = nums.length;

        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Long current = (long) nums[i];

            Long floor = set.floor(current);
            Long ceiling = set.ceiling(current);
            if (floor != null && Math.abs(floor - current) <= valueDiff) {
                return true;
            }

            if (ceiling != null && Math.abs(ceiling - current) <= valueDiff) {
                return true;
            }

            set.add(current);
            if (set.size() > indexDiff) {
                set.remove((long)nums[i - indexDiff]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] testcases = {
            {1,2,3,1},
            {1,5,9,1,5,9},
            {8,7,15,1,6,1,9,15},
            {2,2}
        };

        int[] indexDiffs = {
            3,
            2,
            1,
            2
        };
        int[] valueDiffs = {
            0,
            3,
            3,
            0
        };
        for (int i = 0; i < testcases.length; i++) {
            boolean result = containsNearbyAlmostDuplicate(testcases[i], indexDiffs[i], valueDiffs[i]);
            System.out.println(result);
        }
    }
}
