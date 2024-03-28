package hackerRank.security.functions;

import java.util.Scanner;

public class SecurityInvolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            int first = values[values[i] - 1];
            int second = i + 1;
            if (first != second) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
