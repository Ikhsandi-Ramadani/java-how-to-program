package chapter5;

public class WhileCounter
{
   public static void main( String[] args )
   {
      int counter = 1;

      while ( counter <= 10 )
      {
        System.out.printf( "%d  ", counter );
        ++counter;
      } 
   
      System.out.println();
   }
}

/* Code execution
1  2  3  4  5  6  7  8  9  10 
*/
