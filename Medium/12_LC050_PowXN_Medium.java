class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        
        long N = n;
        boolean isNegative = N < 0;
        if (isNegative) {
            N = -N;
        }
        
        double result = 1.0;
        double currentProduct = x;
        
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= currentProduct;
            }
            if (i > 1) {
                currentProduct *= currentProduct;
            }
        }
        
        return isNegative ? 1.0 / result : result;
    }
}
