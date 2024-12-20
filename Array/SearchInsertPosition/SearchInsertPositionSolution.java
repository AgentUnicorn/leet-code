package Array.SearchInsertPosition;

public class SearchInsertPositionSolution {
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for (;i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int target1 = 7;
        int result = searchInsert(nums1, target1);
        System.out.println(result);
    }
}
