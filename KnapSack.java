import java.util.*;
class KnapSack
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int W=sc.nextInt();
	int w[]=new int[n];
	int value[]=new int[n];
	for(int i=0;i<n;i++)
	w[i]=sc.nextInt();
	
	for(int i=0;i<n;i++)
	value[i]=sc.nextInt();
	
	int dp[][]=new int[n+1][W+1];
	for(int i=0;i<=n;i++)
	{
	  for(int j=0;j<=W;j++)
	  {
	    
	  dp[i][0]=0;
      dp[0][j]=0;}
	}
	for(int i=1;i<=n;i++)
	{
	  for(int j=1;j<=W;j++)
	  {
	    
		 if(j<w[i-1])
		 dp[i][j]=dp[i-1][j];
		 else if(i>0 && j>0)
		 dp[i][j]=Math.max(dp[i-1][j],value[i-1]+dp[i-1][j-w[i-1]]);
	  }
	 }
	 System.out.println(dp[n][n]);
	  
	
  }
}