// Program to read a 4*4 Matrix and display its Main diagonal only.
import java.util.Scanner;
class DisplayMainDiagonal 
{
    public static void main(String[] args)
	{
        int i, j;
        Scanner S = new Scanner(System.in);
        int[][] mat = new int[4][4];
        System.out.println("Enter the elements of the 4x4 matrix:");
        for (i = 0; i < 4; i++) 
		{
            for (j = 0; j < 4; j++)
				{
                mat[i][j] = S.nextInt();
            }
        }
        System.out.println("Main Diagonal Elements:");
        for (i = 0; i < 4; i++) 
		{
            for (j = 0; j < 4; j++)
				{
                if (i == j)
                    System.out.print(mat[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println(); 
        }
    }
}
