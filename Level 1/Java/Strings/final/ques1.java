import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();
        String[] words = input.split("\\s+");
        String smallest = words[0];
        String largest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);

        s.close();
    }
}
