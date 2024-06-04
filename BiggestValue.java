//Program to read 10 random numbers from users and display the biggest number. 
import java.util.Scanner;
class BiggestValue 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
		//int []arr = new int[10];
        for (int i = 0; i < 10; i++) 
		{
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];
        for (int i = 0; i < 10; i++)
			{
            if (temp < arr[i]) 
			{
                temp = arr[i];
            }
        }
        System.out.println("Biggest value: " + temp);
    }
}
