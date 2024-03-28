package Days30Code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class PelindromWithStatckAndQueue {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int n = scanner.nextInt();
            int m = 0;
            for (int i = 1; i < 1000; i++) {
                for (int j = 1; j < 1000; j++) {
                    if (i * j < n && isPalindrome(i * j)) {
                        m = Math.max(m, i * j);
                    }
                }
            }
            System.out.println(m);
        }
        scanner.close();
    }
    
    static boolean isPalindrome(int x) {
        int n = x;
        int p = 1;
        while (n != 0) {
            n /= 10;
            p *= 10;
        } 
        int r = 1;
        p /= 10;
        while (p > r) {
            if ((x / p) % 10 != (x / r) % 10) {
                return false;
            }
            p /= 10;
            r *= 10;
        }
        return true;
    }
}
