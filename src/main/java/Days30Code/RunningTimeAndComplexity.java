package Days30Code;

import java.util.*;
import java.util.stream.IntStream;

public class RunningTimeAndComplexity {
    public static void main(String[] args) {
        System.out.println("How many inputs you want to enter?:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            isPrime(in.nextInt());
//        }
        IntStream.rangeClosed(0,n)
                .forEach(i->isPrime(in.nextInt()));
    }

    static void isPrime(int n) {
        int count = 0;
        if (n == 1)
            System.out.println("Not prime");

        else {
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0)
                    count++;
            }
            if (count == 0)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}
