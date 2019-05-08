import java.util.Scanner;

public class AddMatrices
{
    public static void main(String args[])
    {
        int row, col, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        row = in.nextInt();
        col  = in.nextInt();

        int first[][] = new int[row][col];
        int second[][] = new int[row][col];
        int sum[][] = new int[row][col];

        System.out.println("Enter the elements of first matrix");

        for (c = 0; c < row; c++)
            for (d = 0; d < col; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (c = 0 ; c < row ; c++)
            for (d = 0 ; d < col ; d++)
                second[c][d] = in.nextInt();

        for (c = 0; c < row; c++)
            for (d = 0; d < col; d++)
                sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices

        System.out.println("Sum of the matrices:");

        for (c = 0; c < row; c++)
        {
            for (d = 0; d < col; d++)
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
    }
}