import java.util.*;

  public class Code1 
  { 
	  
    public static void printStarPattern(int n) //method for printing star pattern
     {
       for (int i=0; i<n; i++)
        {
          for (int j=n-i; j>1; j--)
           {
             System.out.print(" ");
           }
          for (int j=0; j<=i; j++ ) 
           {
              System.out.print("* ");
           }
           System.out.println();
         }
      }
    
    public static void printAlphabetPattern(int n) //method for printing alphabet pattern
    {
    	System.out.println("\n\n");
        int x, y;
        int alphabet=65;
        for(x=0; x<n; x++)
        {
            for(y=2*(n-x); y>2; y--)
            {
                System.out.print(" ");
            }
            for(y=0; y<=x; y++)
            {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
             
            System.out.println("\n");
        }
    }
     
  
     public static void main(String args[])
      {
    	int n =5;
        printStarPattern(n);
        printAlphabetPattern(n);
      }
  }
 
  
  
  

