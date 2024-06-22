
// You are using Java
import java.util.*;

class Main {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static boolean strong(int n) {
        int sum = 0;
        int check = n;
        while (n > 0) {
            int last = n % 10;
            sum += fact(last);
            n /= 10;
        }
        return sum == check;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (strong(n))
            System.out.print(n + " Strong Number");
        else
            System.out.print(n + " Not Strong Number");

    }
}