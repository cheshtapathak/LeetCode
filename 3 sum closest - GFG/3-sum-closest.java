//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int X = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.closest3Sum(Arr, N, X));
        }
    }
}
// } Driver Code Ends



//User function Template for Java

class Solution
{
    static int closest3Sum(int A[], int N, int X)
    {
        // code here
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        int ans =-1;
        for(int i =0;i<N;i++){
            int j = i+1;
            int k = N-1;
            int target = X-A[i];
            while(j<k){
                int sum = A[j]+A[k];
                int diff = Math.abs(sum+A[i]-X);
                if(diff<min){
                    min = diff;
                    ans = sum+A[i];
                }
                if(sum<target)j++;
                else k--;
            }
        }
        return ans;
    }
}