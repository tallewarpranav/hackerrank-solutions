package hackerRank.Days30Code;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BitwiseOperation {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        int T = in.nextInt();
//
//        for(int i = 0; i < T; i++){
//
//            int N = in.nextInt();
//            int K = in.nextInt();
//            int max = 0;
//
//            for(int z = 1; z < N; z++){
//
//                for(int j = z + 1; j <= N; j++){
//
//                    int h = z & j;
//
//                    if(h < K && max < h){
//
//                        max = h;
//                    }
//                }
//            }
//            System.out.println(max);
        int n = in.nextInt();
        int sum = Stream.iterate(new int[] {0, 1}, x -> new int[] {x[1], x[0] + x[1]})
                .limit(n)
                .map(x -> x[0])
                .distinct()
                .filter(i -> i % 2 == 0)
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum);



    }
}
