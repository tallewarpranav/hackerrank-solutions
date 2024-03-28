package hackerRank.security.functions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecurityFunction {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int x = scanner.nextInt();
        int result = calculate(x);

        bufferedWriter.write(Integer.toString(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }

    static int calculate(int x) {
        return x % 11;
    }
}
