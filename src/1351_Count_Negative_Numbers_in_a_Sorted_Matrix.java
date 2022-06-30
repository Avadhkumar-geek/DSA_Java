class Leetcode_1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int start = 0;
            int end = grid[i].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (grid[i][mid] < 0) {
                    count += end + 1 - mid;
                    end = mid - 1;
                }
                if (grid[i][mid] >= 0) {
                    start = mid + 1;
                }
            }
        }
        return count;
    }
}
