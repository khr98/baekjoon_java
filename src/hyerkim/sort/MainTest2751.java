package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MainTest2751 {
    private static int SIZE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        SIZE = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < SIZE; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(al);

//       for (int i = 0; i < al.size(); i++){
//           System.out.println(al.get(i));
//       }

        for(int value : al) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);


    }
}
