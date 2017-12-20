/* Multiplication of two numbers by using shiftoperator*/ 
import java.util.Scanner;
public class ShiftOp
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number n");
int n=sc.nextInt();
int mul=n<<2;
System.out.println("multiplication:" +mul);
}
}
