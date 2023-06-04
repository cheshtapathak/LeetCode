import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception {
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.valueOf(br.readLine());
	     while(t-- > 0) {
	         int n = Integer.valueOf(br.readLine());
	         String[] str = br.readLine().trim().split(" ");
	         int[] arr = new int[n];
	         for(int i = 0; i < n; i++) {
	             arr[i] = Integer.valueOf(str[i]);
	         }
	         getFrequency(arr);
	         for(int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	         }
	         System.out.println();
	     }
	}
	
	public static void getFrequency(int[] arr) {
	    HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(!hmap.containsKey(arr[i]))
                hmap.put(arr[i], 0);

            hmap.put(arr[i], hmap.get(arr[i]) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (Map.Entry<Integer ,Integer> entry : hmap.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        int i = 0;

        while(!pq.isEmpty()) {
            int count = pq.peek().getCount();
            while(count-- > 0) {
                arr[i++] = pq.peek().getC();
            }
            pq.poll();
        }
	}
}


class Pair implements Comparable<Pair> {
    private int c;
    private int count;

    Pair(int c, int count) {
        this.c = c;
        this.count = count;
    }

    public int getC() {
        return c;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public int compareTo(Pair p) {
        if(p.count > this.count)
            return 1;
        else if(p.count < this.count)
            return -1;
        else {
            if(p.c < this.c)
                return 1;
            else 
                return -1;
        }
    }
}