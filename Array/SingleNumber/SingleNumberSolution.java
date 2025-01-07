package Array.SingleNumber;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberSolution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Map.Entry<Integer, Integer> min = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }

        return min.getKey();
    }

    // Bit Manipulation using XOR operation (not mine though)
    // https://leetcode.com/problems/single-number/solutions/3021354/java-easy-solution-beats-100-runtime-1ms-bit-manipulation/?envType=problem-list-v2&envId=array
    public static int singleNumber2(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int result = singleNumber2(nums);
        System.out.println(result);
    }
}
