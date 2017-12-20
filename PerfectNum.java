import java.util.Scanner;
public class Perfect
{
public static void main(String[] args) 
{
int number, sum = 0;
Scanner s = new Scanner(System.in);
System.out.print("Enter a number:");
n = s.nextInt();
for(int i = 1; i < number; i++)
{
if(number % i == 0)
{
sum = sum + i;
}
}
if(sum == number)
{
System.out.println("Given number is Perfect");
}
else
{
System.out.println("Given number is not Perfect");
}    
}
}
    
    
