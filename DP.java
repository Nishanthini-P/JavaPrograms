class DP {
    public static void main(String[] args) {

        int n = 10;

        int[] dp = new int[n];

        // Base cases
        dp[0] = 0;
        dp[1] = 1;

        // Dynamic programming approach
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println("First " + n + " fibonacci numbers:");

        // Printing fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}