//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long mL = 1;
        long mR = 1;
        long ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(mL==0)
                mL = 1;
            if(mR==0)
                mR = 1;
            mL *= arr[i];
            mR *= arr[n-i-1];
            ans = Math.max(ans, Math.max(mL, mR));
        }
        return ans;
    }
}