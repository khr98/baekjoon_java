package sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainTest2108 {
    private static int SIZE;
    private static int[] arr;
    private static int[] count;
    private static int SUM;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SIZE = Integer.parseInt(br.readLine());
        arr = new int[SIZE]; //-4000~4000까지

        for(int i = 0; i < SIZE; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[i] = temp;
            SUM += temp;
        }
        //최빈값 구하기
        ArrayList<Point> al = new ArrayList<Point>();
        al.add(new Point(arr[0], 1));
        for (int i = 1; i < SIZE; i++){
            for (int j = 0; j < al.size(); j++){
                if (arr[i] == al.get(j).data)
                    al.get(j).plusCount();
                else
                    al.add(new Point(arr[i], 1));
            }
        }
        Arrays.sort(arr);
        Collections.sort(al, new PointComparator());
        for (int i = 0; i < al.size(); i++){
            System.out.println(al.get(i).data + " " + al.get(i).count);
        }
        //Collections.

        //산술평균구하기
        System.out.println((int)SUM/SIZE);
        //중앙값구하기
        System.out.println(arr[SIZE / 2]);
        //최빈값구하기
        System.out.println(al.get(al.size() - 1).data);
        //범위구하기
        System.out.println(arr[SIZE-1] - arr[0]);
    }

    static class Point{
        int data = 1;
        int count = 3;

        public Point(int data, int count){
            this.data = data;
            this.count = count;
        }
        public void plusCount() {
            this.count++;
        }
    }

    static class PointComparator implements Comparator<Point>{
        @Override
        public int compare(Point a,Point b){
            if(a.count>b.count) return 1;
            if(a.count<b.count) return -1;
            return 0;
        }
    }
}
