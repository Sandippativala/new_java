import java.util.Scanner;

public class P5 {

    public static int[][] addition(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtraction(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplication(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) { 
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value at [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value at [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(matrix1);

        System.out.println("Matrix 2");
        printMatrix(matrix2);

        System.out.println("Matrix Addition:");
        int[][] additionResult = addition(matrix1, matrix2, rows, cols);
        printMatrix(additionResult);

        System.out.println("Matrix Subtraction:");
        int[][] subtractionResult = subtraction(matrix1, matrix2, rows, cols);
        printMatrix(subtractionResult);

        System.out.println("Matrix Multiplication:");
        int[][] multiplicationResult = multiplication(matrix1, matrix2, rows, cols);
        printMatrix(multiplicationResult);

        sc.close();
    }
}
