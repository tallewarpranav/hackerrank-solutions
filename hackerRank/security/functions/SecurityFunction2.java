package hackerRank.security.functions;

import java.io.*;

class Result {

    /*
     * Complete the 'calculate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER x as parameter.
     */

    public static int calculate(int x) {
        return x % 11;

    }

}

public class SecurityFunction2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int x = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.calculate(x);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

