//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length = 15;
            int width = 11;
            int height = 8;
            int numberOfDoors = 1;
            int numberOfWindows = 2;
            
            //declare double totalSqFt;
            double totalSqFt = (length + width) + (2 * (height * length)) + (2 * (height * width));
            //declare double paintNeeded;
            
            //Declare and initialize the length of the room
            double windowAndDoorSqaurefeet = (numberOfDoors * 20) + (numberOfWindows * 15);
            //Declare and initialize the width of the room
            totalSqFt = totalSqFt - windowAndDoorSqaurefeet; 
            //Declare and initialize the height of the room
            double paintNeeded = totalSqFt / COVERAGE;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
 
            //Compute the amount of paint needed
 
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            paintNeeded = Math.ceil(paintNeeded);
            System.out.println("The ammount of paint needed is " + paintNeeded + " gallons");
        }
}