package hackerRank.Days30Code;
import java.util.Scanner;

 class TwoDimensionalArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int sum = arr[i][j] + arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);

        scanner.close();
    }
}
