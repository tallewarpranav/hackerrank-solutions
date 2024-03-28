package security.functions;

import java.util.Scanner;

public class SecurityPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            System.out.println(values[values[i] - 1]);
        }
    }
}
