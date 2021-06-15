import java.util.*;
class matadd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int mat1[][]=new int[n][n];
        int mat2[][]=new int[n][n];
        int matsum[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter element "+(j+1)+" of both matrix");
                mat1[i][j]=sc.nextInt();
                mat2[i][j]=sc.nextInt();
                matsum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("The sum of matrix is");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matsum[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}