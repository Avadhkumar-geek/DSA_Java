class Leetcode_9 {
    public boolean isPalindrome(int x) {
        boolean isOddLen = digit(x) % 2 != 0;
        int halfLen = digit(x) / 2;
        int lastDig = 0;
        for (int i = halfLen - 1; i >= 0; i--) {

            lastDig += (x % 10) * (int) Math.pow(10, i);
            x = x / 10;
        }
        if (isOddLen) {
            x = x / 10;
        }
        return x - lastDig == 0;
    }

    static int digit(int n) {
        int d = 0;
        while (n > 0) {
            n = n / 10;
            d++;
        }
        return d;
    }
}