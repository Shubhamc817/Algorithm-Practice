/* result[i]=j; means queen at i-th row is placed at j-th column.
	 Queens placed at (x1, y1) and (x2,y2)
	  x1==x2 means same rows, y1==y2 means same columns, |x2-x1|==|y2-y1| means
	 they are placed in diagonals.*/
	
import java.util.*;
import java.lang.*;
import java.io.*;
class NQueen
 {
     static int result[];
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 while(T-->0)
	 {
	  int n=sc.nextInt();
	  result=new int[n];
	  if(n==3 || n==2)
	  System.out.print(-1);
	  else
	  placeQueens(0,n);
	  System.out.println();
	 }
	 }
	 static void placeQueens(int x,int size)
	 {
	     for(int i=0;i<size;i++)
	     {
	         if(canPlace(x,i))
	         {
	             result[x]=i;
	             if(x==size-1)
	             {
	                 System.out.print("[");
	                 for(int j=0;j<result.length;j++)
	                  System.out.print(result[j]+1+" ");
	                  //System.out.print(result[result.length-1]+1);
	                   System.out.print("]"+" ");
	         }
	         
	         placeQueens(x+1,size);
	         }
	     }
	     
	 }
	 static boolean canPlace(int x2,int y2)
	 {
	     for(int i=0;i<x2;i++)
	     {
	         if ((result[i] == y2)|| (Math.abs(i - x2) == Math.abs(result[i] - y2))) {
				return false;
			}
		}
		return true;
	   }
	     
	 
}