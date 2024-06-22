import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        int lower_sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                lower_sum += matrix[i][j];
            }
        }

        System.out.println(lower_sum);

        s.close();
    }
}