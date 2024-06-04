//Program to read 10 numbers in an array and display their sum.
import java.util.Scanner;
class Array1D
{
public static void main(String [] args)
{
int sum = 0;
Scanner Sc = new Scanner (System.in);
int numbers[] = new int[10];
//int[]numbers = new int[10];
System.out.println("Please fill up the element of array");
for(int i=0;i<10;i++)
{
numbers[i] = Sc.nextInt();
}
for(int i=0;i<10;i++)
{
sum = sum + numbers[i];
}
System.out.println("The sum="+sum);
}
}
