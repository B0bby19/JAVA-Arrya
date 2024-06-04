//Program to read 3*3 Matrix and Display the Sum of both Diagonal elements.
import java.util.Scanner;
public class DiagonalSum 
{
    public static void main(String[] args)
	{
        Scanner S = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter the elements of the 3x3 matrix");
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                matrix[i][j] = S.nextInt();
            }
        }
        System.out.println("The entered matrix is:");
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            sumDiagonal1 += matrix[i][i];
            sumDiagonal2 += matrix[i][2 - i];
        }
        System.out.println("Sum of the 1st diagonal: " + sumDiagonal1);
        System.out.println("Sum of the 2nd diagonal: " + sumDiagonal2);
    }
}
