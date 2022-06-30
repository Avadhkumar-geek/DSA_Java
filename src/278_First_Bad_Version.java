/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
abstract class VersionControl{
    boolean isBadVersion(int version) {
        return true;
    }
}
class Leetcode_278 extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (start == end && isBadVersion(start)) {
            return start;
        }
        return -1;
    }
}
