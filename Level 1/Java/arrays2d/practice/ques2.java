import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();

        if (rows != cols) {
            System.out.println("The matrix must be square.");
            return;
        }

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i];
        }

        System.out.println(sum);

        s.close();
    }
}
