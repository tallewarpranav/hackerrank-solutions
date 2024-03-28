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

public class EvenFibonacciNumbers {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(find_sum(n));
        }
    }
    static long find_sum(long N)
    {
        long one = 2;
        long two = 8;
        long temp = 0;
        long sum = 0;
        while(one < N)
        {
            sum += one;
            temp = two;
            two = 4 * two + one;
            one = temp;
         }
         return sum;
    }
}
