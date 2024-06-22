// You are using Java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ec = 0;
        int oc = 0;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            if (a % 2 == 0)
                ec++;
            else
                oc++;
        }

        System.out.println("Number of even numbers : " + ec);
        System.out.println("Number of odd numbers : " + oc);
    }
}