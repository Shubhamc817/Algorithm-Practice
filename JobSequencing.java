import java.util.Scanner;
class JobSequencing
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int ar[]=new int[n];
	 int pro[]=new int[n];
	 int dead[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
	   ar[i]=sc.nextInt();
	   
	 }
	 for(int i=0;i<n;i++)
	 {
	   pro[i]=sc.nextInt();
	   
	 }
	 for(int i=0;i<n;i++)
	 {
	   dead[i]=sc.nextInt();
	   
	 }
	 for(int i=0;i<n-1;i++)
	 {
	  for(int j=i;j<n;j++)
	  {
	     if(dead[i]>dead[j])
		 {
		    int temp=dead[i];
			dead[i]=dead[j];
			dead[j]=temp;
			
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			
			temp=pro[i];
			pro[i]=pro[j];
			pro[j]=temp;
			}
			else if(dead[i]==dead[j])
			{
			  if(pro[i]<pro[j])
			  {
			  int temp=dead[i];
			dead[i]=dead[j];
			dead[j]=temp;
			
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			
			temp=pro[i];
			pro[i]=pro[j];
			pro[j]=temp;
		     }
		}
	   }
	}
	   int profit=pro[0];
	   int deadLine=1;
	   System.out.print(ar[0]+" ");
	  for(int i=1;i<n;i++)
	  {
	   if(deadLine<dead[i])
	   {
	      System.out.print(ar[i]+" " );
		  profit+=pro[i];
		  deadLine=dead[i];
		  }
	}
	   System.out.println();
	   System.out.print(profit);
  }
}