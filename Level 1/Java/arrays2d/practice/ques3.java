import java.util.Scanner;

class Main {
    static int Normal(int matrix[][], int N) {
        int sum = 0;
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++) {
                sum += matrix[j][k] * matrix[j][k];
            }
        }
        return (int) Math.sqrt(sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        int normal = Normal(matrix, N);
        System.out.println(normal);

        s.close();
    }
}