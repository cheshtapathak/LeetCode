//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends



// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        int i=0;
        int sum1=0;
        int sum2=(int)(n*(n+1))/2;
        while(i<n-1){
            sum1=sum1+array[i];
            i++;
        }
        
        int missing=sum2-sum1;
        return missing;
    }
}