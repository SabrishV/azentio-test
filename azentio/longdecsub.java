import java.util.Arrays;

public class longdecsub {
    public int lds(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int x : dp) {
            max = Math.max(max, x);
        }
        return max;
    }

    public static void main(String[] args) {
        longdecsub ldsFinder = new longdecsub();
        int[] arr = {6, 7, 5, 8, 1, 4, 2};
        System.out.println("THE LONGEST decreasing SUBsequence length: " + ldsFinder.lds(arr));
    }
}
