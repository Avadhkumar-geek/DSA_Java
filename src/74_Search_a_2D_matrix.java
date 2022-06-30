class Leetcode_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] >= target) {
                int start = 0;
                int end = matrix[i].length - 1;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (matrix[i][mid] == target) return true;
                    if (matrix[i][mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                break;
            }
        }
        return false;
    }
}
