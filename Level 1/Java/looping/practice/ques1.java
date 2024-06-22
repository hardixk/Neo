import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int init = 10;
        int pay = 0;
        for (int i = 0; i < n; i++) {
            pay = pay + init;
            init = init * 2;
        }
        System.out.print(pay);
    }
}