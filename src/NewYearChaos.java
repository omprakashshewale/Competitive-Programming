import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] a) {

     int counter=0;

        int first=1;
        int second=2;
        int third=3;
        for (int i =0;i<a.length-1;i++) {

            if (a[i] ==first) {
            
                first=second;
                second=third;
                third++;
            } else if(a[i] ==second) {
                second=third;
                counter++;
                third++;
            
            }
            else if(a[i] ==third){
                counter+=2;
                third++;
            }
            else {
                System.out.println("Too chaotic");
                return;
            }
        }
        

        System.out.println(counter);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
