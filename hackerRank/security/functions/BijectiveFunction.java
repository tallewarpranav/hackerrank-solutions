package hackerRank.security.functions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BijectiveFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] s = new int[t];
        for (int i = 0; i < t; i++) {
            s[i] = scanner.nextInt();
        }
        scanner.close();

        Set<Integer> set = new HashSet<>();
        for (int num : s) {
            set.add(num);
        }

        if (set.size() == t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
