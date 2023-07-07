package day1;

import java.util.*;

class SetMatrixZeros
{
    public static void setZeroes(int[][] matrix)
    {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i : rows)
        {
            Arrays.fill(matrix[i], 0);
        }
        for(int j : cols)
        {
            for(int i = 0; i < matrix.length; i++)
                matrix[i][j] = 0;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int n = sc.nextInt();
        System.out.print("Cols: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Matrix Elements: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        setZeroes(matrix);

        System.out.print("Updated Matrix: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}