// Program to read 3*3 Matrix and add all elements.
import java.util.Scanner;
class MatrixAdd
{
public static void main(String []args)
{
int sum = 0,i,j;
Scanner S=new Scanner (System.in);
int[][] mat = new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
mat[i][j] = S.nextInt();
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
sum = mat[i][j];
}
}
System.out.print("sum =" +sum);
}
}
