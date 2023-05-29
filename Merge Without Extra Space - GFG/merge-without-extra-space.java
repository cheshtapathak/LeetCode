//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

// } Driver Code Ends



//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
            // code here 
        
        int i=0,j=0,k=n-1;
        
        while(i<=k && j<m)
        {
            if(arr1[i]>arr2[j])
           {
               //it means second array element at index j comes into first array for sure but due to size fixed 
               //so last element of first array which is largest not comes into first array so last array element for sure comes into second array 
               //swap second array element at index j with largest element of first array at index k
               
               long temp =arr1[k];
               arr1[k] = arr2[j];
               arr2[j] = temp;
               
               //decrement k  & increment j to check for next element 
               k--;
               j++;
               
           }else
           //if first array element smaller than second array element at index j no need to do anything just increment i
           i++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
