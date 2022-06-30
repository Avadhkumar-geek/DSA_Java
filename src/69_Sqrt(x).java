class Leetcode_69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else {
            int start = 0;
            int end = x;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid == 0) return 1;
                if (mid == x / mid) {
                    return mid;
                }
                if (mid < x / mid) {
                    start = mid + 1;
                }
                if (mid > x / mid) {
                    end = mid - 1;
                }
            }
            return end;
        }
    }
}
