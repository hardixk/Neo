
// You are using Java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        int result = str1.compareTo(str2);
        System.out.println(result);

    }
}