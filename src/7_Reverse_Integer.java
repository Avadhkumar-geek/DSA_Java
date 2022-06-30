class Leetcode_7 {
    public int reverse(int x) {
        long num = 0;
        while (x != 0) {
            int d = x % 10;
            num = num * 10 + d;
            x = x / 10;
        }
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) num;
    }
}
