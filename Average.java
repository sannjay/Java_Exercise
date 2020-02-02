import java.util.Scanner;
import java.lang.Math.*;
public class Average {
  public static void main(String[] args) 
  {
  int a,b,c;
  Scanner s = new Scanner(System.in);
  System.out.println("Please Enter 3 numbers");
  a=s.nextInt();
  b=s.nextInt();
  c=s.nextInt();
  s.close();
  double r = (a+b+c)/3;
  
  System.out.println("Average of 3 numbers is = " + r);
  
 }
}