package Days30Code;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getProductSuggestions' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY products
     *  2. STRING search
     */

    public static List<List<String>> getProductSuggestions(List<String> products, String search) {
        // Write your code here
        List<List<String>> result = new ArrayList<>();
        Collections.sort(products);
        int startIndex = 0;
        for(int i=0; i< search.length(); i++) {
            List<String> row = new ArrayList<>();
            if(startIndex != -1) {
                String prefix = search.substring(0, i+1);
                startIndex = lowerBound(products, prefix);
                if(startIndex != -1) {
                    for(int j= startIndex; j<startIndex +3 && j< products.size();++j) {
                        String candidate = products.get(j);
                        if(candidate.startsWith(prefix)) {
                            row.add(candidate);
                        }
                    }
                }
            }
            result.add(row);
        }
        return result;
    }
    private static int lowerBound(List<String> products, String target) {
        int bound = -1;
        int left = 0;
        int right = products.size() - 1;

        while(left <= right) {
            int mid = left + ((right - left) >> 1);
            String midStr = products.get(mid);
            if(midStr.startsWith(target) || target.compareTo(midStr) < 0) {
                bound = mid;
                right = mid - 1 ;
            } else {
                left = mid + 1;
            }
        }
        return bound;
    }

}

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int productsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> products = IntStream.range(0, productsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        String search = bufferedReader.readLine();

        List<List<String>> result = Result.getProductSuggestions(products, search);

        result.stream()
                .map(
                        r -> r.stream()
                                .collect(joining(" "))
                )
                .map(r -> r + "\n")
                .collect(toList())
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
