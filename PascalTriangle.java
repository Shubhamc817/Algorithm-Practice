import java.util.*;
import java.lang.*;
import java.io.*;
class PascalTriangle
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
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

	      
	  }
	  System.out.println();
	 }
	 }
}