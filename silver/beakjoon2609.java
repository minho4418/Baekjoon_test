package silver;

import java.io.*;
import java.util.*;

public class beakjoon2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int line1 = Integer.parseInt(line[0]);
        int line2 = Integer.parseInt(line[1]);
        int b;
        List<Integer> c1 = new ArrayList<>();
        List<Integer> c2 = new ArrayList<>();
        int d = 0;
        int a1, a2;

        if(line1 <= line2) {
            for(b=1;b<=line1;b++) {
                if ((line1 % b) == 0 && (line2 % b) == 0) {
                    c1.add(b);
                }
            }
        }else if(line1 > line2){
            for(b=1;b<=line2;b++) {
                if ((line1 % b) == 0 && (line2 % b) == 0) {
                    c1.add(b);
                }
            }
        }
        a1 = c1.get(c1.size()-1);
        System.out.println(a1);

        for(b=1;b<=(line1*line2);b++) {
            if ((b % line1) == 0 && (b % line2) == 0) {
                c2.add(b);
            }
        }
        a2 = c2.get(0);
        System.out.println(a2);
    }
}

// 시간 엄청 줄여짐. 알고리즘 파악하기
//public class Main {
//    static int a, b;
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(in.readLine()," ");
//        a = Integer.parseInt(st.nextToken());
//        b = Integer.parseInt(st.nextToken());
//
//        if(a<b) {
//            int tmp = a;
//            a = b;
//            b = tmp;
//        }
//
//        int g = gcd(a,b);
//        int l = a * b / g;
//        System.out.println(g);
//        System.out.println(l);
//
//    }
//    static int gcd(int a, int b) {
//        if(a%b ==0) {
//            return b;
//        }else
//            return gcd(b, a%b);
//    }
//}