// Program to read 4*4 matrix, transpose it and display in proper format. 
import java.util.Scanner;
class TransposeMatrix
{
    public static void main(String[] args)
	{
        Scanner S = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        System.out.println("Enter the elements of the 4x4 matrix:");
        for (int i = 0; i < 4; i++)
		{
            for (int j = 0; j < 4; j++) 
			{
                matrix[i][j] = S.nextInt();
            }
        }
        int[][] transposedMatrix = new int[4][4];
        for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 4; j++)
			{
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed matrix:");
        for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 4; j++) 
			{
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        
       S.close();
    }
}
