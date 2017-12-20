import java.util.Scanner;
public class fizzbuzz
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
 System.out.println("Enter the number");
 int n=s.nextInt();
 for(int i=1;i<=n;i++)
{
 if(i%5==0)
 System.out.println("Buzz\n");
else if(i%3==0)
 System.out.println("Fizz\n");
 else if((i%3==0)&&(i%5==0))
 System.out.println("FizzBuzz");
 else System.out.println(i);
}
}
}    
         
    
