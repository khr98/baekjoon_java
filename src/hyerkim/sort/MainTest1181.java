package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class MainTest1181 {
    private static int SIZE;
    private static String arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SIZE = Integer.parseInt(br.readLine());
        arr = new String[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = br.readLine();
        }


        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else
                return o1.length() - o2.length();

        });

        for (int i = 0; i < SIZE-1; i++) {
            if (arr[i].equals(arr[i+1])) {
               continue;
            }
            System.out.println(arr[i]);
        }
        System.out.println(arr[SIZE-1]);
    }
}
