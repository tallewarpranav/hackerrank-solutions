package hackerRank.security.functions;

import java.util.Scanner;

public class SecurityFunctionInverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(indexOf(s, i) + 1);
        }
    }

    private static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // If target not found
    }
}
