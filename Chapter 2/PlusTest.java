// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
         // it would bring the two statements togther to form a sentence 
         System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
         //it will all compile and will work but not include a space
         //between the number on both sides
         System.out.println ("8 plus 5 is " + 8 + 5);
         // it will bring up the answer of 85 because it adds the 2 numbers to be one number
         System.out.println ("8 plus 5 is " + (8 + 5));
         //it will bring up the answer
         System.out.println (8 + 5 + " equals 8 plus 5.");
         //it will say the answer equals eight plus five
        }
}