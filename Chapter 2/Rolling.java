import java.util.Random;
 
public class Rolling
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int Dice1, Dice2; 
 
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
          Dice1 = generator.nextInt(6) + 1 ;
          
          // Generate lucky2 (a random integer between 11 and 30) using nextFloat
 
          Dice2 = generator.nextInt(6) + 1;
 
          System.out.println ("Dice One = " + Dice1);
          System.out.println ("Dice Two = " + Dice2);
          System.out.println ("The Total of the Dice is " + Dice1 + " and " + Dice2);
        }
}
