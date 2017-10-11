
// ***************************************************************
//   Names.java
//
//   Prints a list of student names with their hometowns
//   and intended major
// ***************************************************************
public class Student_Grades
{
        // ------------------------
        // main prints the list
        // ------------------------
        public static void main (String[] args)
        {
         header();
         dataTitles();
         filldata();
         System.out.println ();
        }
        public static void header(){
         System.out.println ();
         System.out.println ("\t----------------------------------");
         System.out.println ("\t==\tStudent Points\t\t==");
         System.out.println ("\t----------------------------------");
        }
        public static void dataTitles(){
         System.out.println ("\tName\t\tLab\tBonus\tTotal");
         System.out.println ("\t----\t\t---\t-----\t-----");
        }
        public static void filldata(){
            data("\t" + "Joe\t", 43, 7);
            data("\t" + "William\t", 50, 8);
            data("\t" + "Mary Sue", 39, 10);
            data("\t" + "Colby\t", 0, 1);
        }
        public static void data (String name, int lab, int bonus) {
            System.out.println(name + "\t" + lab + "\t" + bonus +"\t" + (lab + bonus));
        }
}