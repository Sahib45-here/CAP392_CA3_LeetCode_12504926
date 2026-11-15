class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        // Iterate through each digit position (1, 10, 100, ...)
        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            // Count full cycles of 10, plus the remainder
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
        }
        return count;
    }
}