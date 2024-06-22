import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int i = str.length() - 1;
        while (i >= 0) {
            System.out.print(str.charAt(i));
            i--;
        }
    }
}