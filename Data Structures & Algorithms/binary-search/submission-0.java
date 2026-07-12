class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1;  // base case: not found
        }

        int mid = low + (high - low) / 2;  // safe midpoint

        if (nums[mid] == target) {
            return mid;  // found
        } else if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, high, target);  // search right half
        } else {
            return binarySearch(nums, low, mid - 1, target);   // search left half
        }
    }
}
