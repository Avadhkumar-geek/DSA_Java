class Leetcode_441 {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        long ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long t = mid * (mid + 1) / 2;
            if (t == n) return (int) mid;
            if (t <= n) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return (int) ans;
    }
}
