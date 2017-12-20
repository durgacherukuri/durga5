//lenght conversion from Meter to Centimeter

import java.util.Scanner;
// the name of our class its public
public class LengthConversion {
    //void main
        public static void main (String[] args)
        {
            //declare float
            float m,cm;
            System.out.println("Enter Length in meter:");
            //Take input
            Scanner input = new Scanner(System.in);
            //calculate
             m= input.nextFloat();
             cm = from*100;
            System.out.println("Length in centimeter = "+cm);
        }
}