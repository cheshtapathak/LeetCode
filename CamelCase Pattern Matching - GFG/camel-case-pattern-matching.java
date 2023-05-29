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
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends



//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
    TreeMap<String,ArrayList<String>> hs=new TreeMap<>();
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            String str=Dictionary[i]+"";
            String ans="";
            for(int j=0;j<str.length();j++)
            {
              if(str.charAt(j)>='A' && str.charAt(j)<='Z')
              {
                  ans=ans+str.charAt(j);
              }
            }
            
            if(!hs.containsKey(ans))
            {
              
                hs.put(ans,new ArrayList<>());
            }
            hs.get(ans).add(str);
            
        }
        
        // for(String k:hs.keySet())
        // {
        //     System.out.println(k);
        // }
        
        
        PriorityQueue<String> p=new PriorityQueue<>();
        
        // if(!hs.containsKey(Pattern))
        // {
        //  arr.add("-1");
        // }else
        // {
          for(String i:hs.keySet())
          {
              
              
            //   while(i.indexOf(Pattern)!=-1))
            //   {
            //       i=i.substring(0,i.length()-1);
            //   }
              
              if(i.startsWith(Pattern))
              {
                  ArrayList<String> t1=new ArrayList<>(hs.get(i));
                  for(String j:t1)
                  {
                      p.add(j);
                  }
                  
              }
          }
          while(p.size()>0)
          {
              arr.add(p.poll());
          }
          
            
            
            if(arr.size()==0)
            {
                arr.add("-1");
            }
        // }
        
        return arr;
        
    }
}