import java.util.Scanner;
public class MulBin extends AddBin
{
public static void main(String[] args)
  {
         int mul=0, f=1;

         Scanner s = new Scanner(System.in);
         System.out.print("Enter first binary : ");
         long b1=s.nextLong();
         System.out.print("Enter second binary : ");
         long b2=s.nextLong();
         s.close();

      if(b2!=0)
       {
       while(b2!=0)
        {
         int d = (int)(b2%10);
         if(d!=0)
         {
          b1=b1*f;
          mul=add(b1,mul);
         }
       b2/=10;
       f*=10;
      }
    }
System.out.print("Product of two binary numbers: "+mul);
}
}