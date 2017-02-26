import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        int[] temp= new int[3];
        temp[0]= s.nextInt();
        temp[1]= s.nextInt();
        temp[2]= s.nextInt();
        Arrays.sort(temp);
        a=temp[0];
        b=temp[1];
        c=temp[2];
        String string = s.next();
        for (int i = 0 ; i <3 ; i++){
            if(string.charAt(i)=='A'){System.out.println(a+" ");}
            else if(string.charAt(i)=='B'){System.out.println(b+" ");}
            else if(string.charAt(i)=='C'){System.out.println(c+" ");}
        }
    }
}
