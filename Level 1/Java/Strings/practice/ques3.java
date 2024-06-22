import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String result = input.replaceAll(" ", "");
        System.out.println(result);
        s.close();
    }
}
