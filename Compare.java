import java.util.Scanner;
public class Compare
{
public static void main(String[] arr)
{
int a,b,s;
Scanner p = new Scanner(System.in);
System.out.println("Input First Integer:");
a=p.nextInt();
System.out.println("Input second Integer:");
b=p.nextInt();
//System.out.printf("%d > %d",a,b);
s=(a<b?b:a);
if(a!=b)
{
System.out.printf("%d != %d \n",a, b);
if(a>b)
{
System.out.printf("%d > %d \n",a,b);
System.out.printf("%d >= %d \n",a,b);
}
else
{
System.out.printf("%d < %d \n",a,b);
System.out.printf("%d <= %d \n",a,b);
}
}
else
System.out.printf("%d = %d \n",a,b);
}
}