/* converting kilometers to meters*/
	import java.util.Scanner;
	public class KilometerToMeter
	{
	    public static void main(String[] args) {
	        int m=1000;
	        //1km=1000meters
	        System.out.println("Enter Kilometer: ");
	        double km;
	        Scanner reader = new Scanner(System.in);
	        km = reader.nextDouble();
	        double meter=km*m;
	        System.out.println("meter:"+meter);
	    }
	}
