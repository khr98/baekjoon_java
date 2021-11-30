package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MainTest10814 {
    private static int SIZE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Member member[];
        int age;
        String name;

        SIZE = Integer.parseInt(br.readLine());
        member = new Member[SIZE];
        for (int i = 0; i < SIZE; i++) {
            st = new StringTokenizer(br.readLine());
            age = Integer.parseInt(st.nextToken());
            name = st.nextToken();
            member[i] = new Member(age, name);
        }

        Arrays.sort(member, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < SIZE; i++) {
            System.out.println(member[i].age + " "+member[i].name);
        }
    }

    static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
