package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MainTest11650 {
    private static int arr[][];
    private static int SIZE;

    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        SIZE = Integer.parseInt(br.readLine());
        arr = new int[SIZE][2];

        for (int i = 0; i < SIZE; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
//        int temp_x;
//        int temp_y;
//        for (int i = 0; i < SIZE - 1; i++){
//            for (int j = 1; j < SIZE; j++){
//                if (arr[i][0] > arr[j][0]){
//                    temp_x = arr[i][0];
//                    temp_y = arr[i][1];
//                    arr[i][0] = arr[j][0];
//                    arr[i][1] = arr[j][1];
//                    arr[j][0] = temp_x;
//                    arr[j][1] = temp_y;
//                    break;
//                }
//                else if (arr[i][0] == arr[j][0]){
//                    if (arr[i][1] > arr[j][1]){
//                        temp_y = arr[i][1];
//                        arr[i][1] = arr[j][1];
//                        arr[j][1] = temp_y;
//                        break;
//                    }
//
//                }
//            }
 //       }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                else
                    return o1[0] - o2[0];
            }
        });

        for(int i = 0; i < SIZE; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }



}
