//Program to read a number and search it in the array "Numbers". Assume as array of 15 random numbers.
import java.util.Scanner;
class SearchOperating
{
public static void main(String [] args)
{
int [] Numbers = new int[15];
Scanner S = new Scanner(System.in);
for(int i=0;i<15;i++)
{
Numbers[i] = S.nextInt();
}
System.out.print("Enter number to search");
int n = S.nextInt();

for (int i=0;i<15; i++)
{
if(n== Numbers[i])

{

System.out.println(n+"found at" + (i+1));
}
}
}
}


