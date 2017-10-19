import java.util.*;
import java.lang.*;
import java.io.*;
/*
for n=7, pascal triangle would look like
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1 
1 6 15 20 15 6 1 
*/
class PascalTriangle
 {
	public static void main (String[] args)
	 {
	 
	 Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();//denotes the number of test cases
	 while(T-->0)
	 {
	  int n=sc.nextInt(); 
	  int ar[][]=new int[n][n];
	  for(int line=0;line<n;line++)
	  {
	      for(int i=0;i<=line;i++)
	      {
	          if(i==0||line==i)
	          ar[line][i]=1;
	          else
	          ar[line][i]=ar[line-1][i-1]+ar[line-1][i];
	          System.out.print(ar[line][i]+" ");
	      }
          System.out.println();
	      
	  }
	  System.out.println();
	 }
	 }
}
