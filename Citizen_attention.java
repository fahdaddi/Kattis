import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Citizen_attention {

	public static void main(String[] args) {
		FastReader s=new FastReader();
        int T = s.nextInt();
        
        while (T-- > 0)
        {
        	int[][] mat = new int[5][5];
        	int n = s.nextInt();
        	while(n-->0){
        		mat[s.nextInt()][s.nextInt()]=s.nextInt();
        	}
        	int[] res = new int[5];
        	Long min = Long.MAX_VALUE;
        	for( int a = 0 ; a < 21 ; a++){
        		for( int b = a+1 ; b < 22 ; b++ ){
        			for( int c = b+1 ; c < 23 ; c++ ){
        				for( int d = c+1 ; d < 24 ; d++ ){
        					for(int e = d+1;e<25;e++){
        						int Sum = 0;
        						for(int search = 0 ; search < 25 ; search++){
        							int row = search / 5, col = search % 5;
        							int first = Math.abs(row-a/5)+Math.abs(col-a%5);
        							int second = Math.abs(row-b/5)+Math.abs(col-b%5);
        							int third = Math.abs(row-c/5)+Math.abs(col-c%5);
        							int fourth = Math.abs(row-d/5)+Math.abs(col-d%5);
        							int fifth = Math.abs(row-e/5)+Math.abs(col-e%5);
        							Sum += mat[row][col]*Math.min(first, Math.min(second, Math.min(third, Math.min(fourth, fifth))));
        						}
        						if(Sum < min){
        							res = new int[]{a,b,c,d,e};
        							min = (long) Sum;
        						}
        					}
        				}
        			}
        		}
        	}
            System.out.println(res[0]+" "+ res[1]+" "+res[2]+" "+res[3]+" "+res[4]);
        }
        

	}
	
	
	
	
	
	
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    

}
