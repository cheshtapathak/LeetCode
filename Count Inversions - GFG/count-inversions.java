//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends



//User function Template for Java

class Solution
{
    // arr[(int)]: Input Array
    // N : Size of the Array arr[(int)]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr, 0,N-1);
    }
    static long mergeSort(long arr[],long l, long n){
        long low = l, high = n,count = 0;
        if(low < high){
            long mid = (low + high) / 2;
            count +=mergeSort(arr, low, mid);
            count +=mergeSort(arr, mid+1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }
    static long merge(long arr[], long l, long m, long h){
        long i = l, j = m+1,count = 0,k=0;
        long[] a = new long[(int)(h-l+1)];
        while(i <= m && j <= h){
            if(arr[(int)i] > arr[(int)j]){
                count = count + m + 1 - i;
                a[(int)k++] = arr[(int)j++];
            }else{
                a[(int)k++] = arr[(int)i++];
            }
        }
        while(j<=h){
            // count = count + m - l + 1 - i;
            a[(int)k++] = arr[(int)j++];
        }
        while(i<=m){
            a[(int)k++] = arr[(int)i++];
        }
        for(long p=l;p<=h;p++){
            arr[(int)p] = a[(int)(p-l)];
        }
        // System.out.println(count);
        return count;
        
    }
}