// Program to read two matrix of 3*3 and add them. finally display in proper format.
import java.util.Scanner;
class AddMatrix 
{
    public static void main(String[] args) 
	{
        Scanner S = new Scanner(System.in);
        int[][] Mat1 = new int[3][3];
        int[][] Mat2 = new int[3][3];
        int[][] result = new int[3][3]; 
        System.out.println("Enter values for Matrix 1:");
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                Mat1[i][j] = S.nextInt();
            }
        }
        System.out.println("Enter values for Matrix 2:");
        for (int i = 0; i < 3; i++)
		{
            for (int j = 0; j < 3; j++)
			{
                Mat2[i][j] = S.nextInt(); 
            }
        }
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                result[i][j] = Mat1[i][j] + Mat2[i][j]; 
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 3; i++)
		{
            for (int j = 0; j < 3; j++) 
                System.out.print(result[i][j] + " "); 
            }
            System.out.println(); 
        }
    }

