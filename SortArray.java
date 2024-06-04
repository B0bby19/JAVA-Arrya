//Program to read 10 integer number in an array and sort them.
import java.util.Scanner;
class SortArray
{
public static void main(String[] args)
{
Scanner Sc = new Scanner(System.in);
int nums[]=new int[10];
System.out.println("Enter 10 number");
for( int i=0;i<10;i++)
{
nums[i]=Sc.nextInt();
}


for(int i=0;i<10;i++)
{
for(int j=i+1;j<10;j++)
{
if(nums[i]>nums[j])
{
int c = nums[i];
nums[i]=nums[j];
nums[j]=c;
}
}
}
for(int i=0;i<10;i++)
{
System.out.println(nums[i]+"Sorted array");
}

}
}

