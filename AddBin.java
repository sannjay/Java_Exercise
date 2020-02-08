import java.util.Scanner;
public class AddBin{
public static void main(String[] args){

Scanner s = new Scanner(System.in);
System.out.print("Enter first binary : ");
long k=s.nextLong();
System.out.print("Enter second binary : ");
long l=s.nextLong();
s.close();
int p=add(k,l);
System.out.print("Sum of two binary numbers: "+p);
}
public static int add(long k, long l)
{
  int[] sum=new int[20];
  int i=0,rem=0,m=0;
   while(k!=0 || l!=0)
   {
    sum[i++] = (int)((k%10+l%10+rem)%2);
    rem = (int)((k%10+l%10+rem)/2);
    k=k/10;
    l=l/10;
   }
   if(rem!=0)
  {
   sum[i]=rem;
  }

while(i>=0)
m = m*10+ sum[i--];
//System.out.print(sum[i--]);

return m;
}
}