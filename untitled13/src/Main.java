import java.util.*;

class Matrix {

    private final int m;
    private final int n;
    private int[][] matrix;

    Matrix(int rows, int cols) {
        m = rows;
        n = cols;
        matrix = new int[m][n];
    }

    public void initialize() {
        Random r = new Random();

        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                this.matrix[i][j] = r.nextInt(100);
            }
        }
    }

    public void showMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int average() {
        return sum() / (m * n);
    }

    private int sum() {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public void subtractNumber(int num) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] -= num;
            }
        }
    }
}
