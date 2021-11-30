package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kakao {
    private static char arr[];
    private static String str;
    private static int k;
    private static boolean flag;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        str = scanner.nextLine();
        arr = new char[str.length()];
        arr = str.toCharArray();
        k = scanner.nextInt();


        int count = 0;

        //문자열에있는 1의 개수와 k의 개수가 다를경우
        for (int n = 0; n < arr.length - k; n++) {
            count = 0;
            int start = 0;
            int end = 0;
            flag = false;
            for (int i = n; i < arr.length; i++) {
                if (arr[i] == '1') {
                    if (flag == false) {
                        start = i;
                        flag = true;
                    }
                    count++;
                }
                if (count == k) {
                    end = i;
                    String temp;
                    temp = str.substring(start, end + 1);
                    list.add(temp);
                    break;
                }
            }
        }
        String result;
        int index = 0;
        if (list.size() == 1)
            result = list.get(0);
        else{
            result = list.get(0);
            int min = result.length();
            index = 0;
            for (int i = 1; i < list.size(); i++){
                result = list.get(i);
                if (result.length() < min){
                    min = result.length();
                    index = i;
                }
            }
        }
        System.out.println(list.get(index));

    }
}
