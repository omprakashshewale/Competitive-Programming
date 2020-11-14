import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {


       int[] response= new int[2];
        int minCount=0;
        int maxCount=0;
        int maxScore=0;
        int minScore=0;
        
        for (int i=0;i<scores.length;i++) {
            
        if(i==0) {
            maxScore=scores[i];
            minScore=scores[i];
        }
        if(maxScore<scores[i]) {
            maxScore=scores[i];
            maxCount+=1;
        }
        else if(minScore>scores[i]) {
            minScore=scores[i];
            minCount+=1;
        }
        
            
        }
        System.out.println(maxCount);
        System.out.println(minCount);
        response[0]=maxCount;
        response[1]=minCount;
        return response;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
