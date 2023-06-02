//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends



// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        
        ArrayList<ArrayList<Long>> list=new ArrayList<ArrayList<Long>>();
        for(int i=0;i<n;i++){
            ArrayList<Long> sublist=new ArrayList<Long>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    sublist.add(1L);
                }
                else{
                   long res = list.get(i-1).get(j-1)+list.get(i-1).get(j);
                   sublist.add(res%(1000000007));
                }
               
            }
             list.add(sublist);
        }
        return list.get(n-1);
        
        
    }
}