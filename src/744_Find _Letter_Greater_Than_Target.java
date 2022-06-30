class Leetcode_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int start = 0;
        int end = letters.length - 1;;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] < target || letters[mid] == target) {
                start = mid + 1;
            } else {
                ans = letters[mid];
                end = mid - 1;
            }
        }
        return ans;
    }
}
