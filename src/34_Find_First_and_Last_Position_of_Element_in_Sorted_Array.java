class Leetcode_34 {
    public int[] searchRange(int[] nums, int target) {
        int x = startIndx(nums, target);
        int y = endIndx(nums, target);

        return new int[] {
            x,
            y
        };

    }
    public int startIndx(int[] nums, int target) {
        int indx = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid] == target) indx = mid;
            if (target <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return indx;
    }

    public int endIndx(int[] nums, int target) {
        int indx = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid] == target) indx = mid;
            if (target >= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return indx;
    }

}
