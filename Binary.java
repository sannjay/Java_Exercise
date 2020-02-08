import java.util.Scanner;
public class Binary{

public static void main(String[] arr)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter binary number: ");
long q=s.nextLong();
System.out.print("Enter decimal number : ");
int p=s.nextInt();
s.close();

System.out.println("Binary to Decimal :" + bin2dec(q));
System.out.println("Decimal to binary :" + dec2bin(p));
}

public static int bin2dec(long k)
{
int f=1,num=0;
 while(k!=0)
  {
   int r=(int)(k%10);
   num=num+r*f;
   k/=10;
   f*=2;
  }
return num;
}

public static long dec2bin(int k)
{
int f=1;
long num=0;
 while(k!=0)
  {
   int r=k%2;
   num=num+r*f;
   k/=2;
   f*=10;
//System.out.printf("num %d rem %d fact %d \n",k,r,f);
  }
return num;
}
}