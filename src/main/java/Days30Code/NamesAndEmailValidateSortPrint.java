package Days30Code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NamesAndEmailValidateSortPrint {
    public static void main(String[] args) throws IOException {
        System.out.println("How many input you want to enter? (Maximum 30):");
        Scanner in = new Scanner(System.in);

        System.out.println("Thank you. sample pattern for input is firstName email (ends with @gmail.com).....");
        int n = in.nextInt();
        List<String> names = new ArrayList<>();

        for(int i = 0; i < n; i++){

            String firstName = in.next();
            String emailID = in.next();

            if(emailID.contains("@gmail.com")){
                names.add(firstName);
            }
        }
        Collections.sort(names);
        System.out.println("Keep calm. We are sorting first name from each inputs.");
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000); // Pause for 2 seconds
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // Create a thread and start it to execute the runnable
        Thread thread = new Thread(r);
        thread.start();

        try {
            // Wait for the thread to finish (for 2 seconds)
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("===================================");
        System.out.println("Your inputs are sorted:");
        System.out.println("===================================");
        for(String name : names){
            System.out.println(name);
        }
    }
}
