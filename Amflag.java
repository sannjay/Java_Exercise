public class Amflag {
  public static void main(String[] args) 
  {
     for(int r=0; r<15; r++)
     {
      System.out.println(); 
       for(int i=0; i<46; i++)
       {
         if(r<9 && i<6)
         {
          if (r%2==0)
          System.out.print("* ");
         else
         if(i<5)
          System.out.print(" *");
         else System.out.print("  ");
         }
        else
         if(r<9 && i>39) 
         break;
        else
         System.out.print("=");
      }
    }
  }
}