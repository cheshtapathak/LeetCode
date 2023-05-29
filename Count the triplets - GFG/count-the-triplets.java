//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends



//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
      Arrays.sort(arr);
      int c = 0;
      for(int i=n-1;i>=2;i--){
          int l =0,h = i-1;
          while(l<h){
              if(arr[l]+arr[h]==arr[i]){
              c++;
              l++;
              h--;
              }
              else if(arr[l]+arr[h]<arr[i]){
                  l++;
              }
              else
              h--;
          }
      }
      return c;
    }
}