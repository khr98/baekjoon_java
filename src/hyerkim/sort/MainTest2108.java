package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTest2108_2 {
    private static int SIZE;
    private static int[] arr;
    private static int[] count;
    private static int SUM;
    private static int MAX;
    private static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        SIZE = Integer.parseInt(br.readLine());
        arr = new int[SIZE]; // -4000 ~ 4000
        count = new int[8001];

        for (int i = 0; i < SIZE; i++){
            arr[i] = Integer.parseInt(br.readLine());
            count[arr[i] + 4000]++;
            SUM += arr[i];
        }
        Arrays.sort(arr);

        //최빈값 찾기
        for(int i = 0; i < 8001; i++){
            if (count[i] >= MAX)
                MAX = count[i];
        }
        for (int i = 0; i < 8001; i++){  //중복된 최대값이 있을경우를 찾기위해
            if (count[i] == MAX)
                list.add(i - 4000);
        }

        if (list.size() == 1)
            result = list.get(0);
        else{
            Collections.sort(list);
            result = list.get(1);
        }
        //산술평균구하기
        //System.out.println((int)SUM/SIZE);
        //System.out.println((int)Math.round(SUM/SIZE));
        System.out.println(Math.round((double)SUM/SIZE));
        //중앙값구하기
        System.out.println(arr[SIZE / 2]);
        //최빈값구하기
        System.out.println(result);
        //범위구하기
        System.out.println(arr[SIZE-1] - arr[0]);


    }
}
