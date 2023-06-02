//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int point=N;
        List<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                point=i-1;
                break;
            }
        }
        if(point==N){
            for(int i=N-1;i>=0;i--){
                list.add(arr[i]);
            }
            return list;
        }
        for(int i=N-1;i>point;i--){
            if(arr[point]<arr[i]){
                int temp=arr[point];
                arr[point]=arr[i];
                arr[i]=temp;
                break;
            }
        }
        for(int i=0;i<=point;i++){
            list.add(arr[i]);
        }
        for(int i=N-1;i>point;i--){
            list.add(arr[i]);
        }
        return list;
    }
}