import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  Scanner s =new Scanner(System.in);
  System.out.print("Input a number:");
  int p = s.nextInt();
  int i =1;
   while(i<=10)
   {
     System.out.println(p+" x "+i+" = "+p*i);
     i++;
   }
    
  }
}