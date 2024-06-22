import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); // 5
        int b = s.nextInt(); // 15

        for (int i = 1; i <= b; i++) {
            System.out.println(i + "*" + a + "=" + (i * a));
        }
    }
}