import java.util.*;
class LongestPalindromicString
{
  private static int lo, maxlen;
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 int len = s.length();
	if (len < 2)
		System.out.println(s);
	else
	{
	 for(int i=0;i<s.length()-1;i++)
	 {
	    extendPalindrom(s,i,i);//assuming string of odd length
		extendPalindrom(s,i,i+1);//assuming string of even length
	 }
	 System.out.println(s.substring(lo,lo+maxlen));
  }
  }
   static void extendPalindrom(String s,int j,int k)
   {
      while((j>=0 && k<s.length()) &&(s.charAt(j)==s.charAt(k)))
	  {
	  j--;
	  k++;
	  }
	  if(maxlen<k-j-1)
	  {
	  lo=j+1;
	  maxlen=k-j-1;}
   }
}