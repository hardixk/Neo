// You are using Java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        int target = s.nextInt();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            int diff = target - list.get(i);
            if (list.contains(diff))
                flag = true;
        }

        if (flag)
            System.out.print("Array has two elements with given sum " + target);
        else
            System.out.print("Array doesn't have two elements with given sum " + target);
    }
}