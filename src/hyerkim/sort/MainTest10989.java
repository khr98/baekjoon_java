package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTest10989 {
    private static int[] count;
    private static int SIZE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        SIZE = Integer.parseInt(br.readLine());
        count = new int[10001]; // count배열의 크기 = 숫자의 범위 (10000보다 작거나 같은 자연수)

        for (int i = 0; i < SIZE; i++) {
            int temp = Integer.parseInt(br.readLine());
            count[temp]++; // 해당 위치의 count의 인덱스의 값 증가
        }

        for(int i = 1; i < 10001; i++){ // 자연수 1부터 시작하므로 1부터 (count 배열)
            while(count[i] > 0){  // 가장작은값(index = 1)부터 저장된 값 = 개수 만큼 출력시작.
                sb.append(i).append('\n');
                count[i]--;  //값 감소
            }
        }
        System.out.println(sb);
    }}
