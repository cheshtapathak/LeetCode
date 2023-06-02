//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

// } Driver Code Ends

//User function Template for Java

class Solution{
    private static  int count;
    static int subsetXOR(int arr[], int n, int k) {
        // code here
        count = 0;
        rec(arr, 0, n, k, 0);
        return count;
    }
    static void rec(int arr[], int index,int n , int k, int xor){
        if(index == n){
            if(xor == k){
                count++;
            }
            return;
        }
        rec(arr, index+1, n, k, xor^arr[index]);
        rec(arr, index+1, n, k, xor);
    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0)
        {
            int N = s.nextInt();
            int K = s.nextInt();
            int arr[] = new int[N];
            for(int i =0;i<N;i++)
            {
                arr[i] =s.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.subsetXOR(arr,N,K));
        }
    }
}
// } Driver Code Ends