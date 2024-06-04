//Program to read 3*3 Matrix and increase the element values of both diagonal by 2. 
import java.util.Scanner;
class IncreaseDiagonal
{
    public static void main(String[] args)
	{
        Scanner S= new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                matrix[i][j] = S.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                if (i == j || i + j == 2) 
				{ 
                    matrix[i][j] += 2;
                }
            }
        }
        System.out.println("Modified matrix:");
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        S.close();
    }
}
