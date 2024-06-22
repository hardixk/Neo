import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int a = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    a = arr[i];
                    break;
                }
            }
            if (a != -1)
                break;
        }
        if (a == -1) {
            System.out.print("There are no repeating elements");
        } else {
            System.out.print("The first repeating element is " + a);
        }
    }
}