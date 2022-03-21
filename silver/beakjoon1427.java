package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class beakjoon1427 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
    // collections는 리스트형을 받음
        Arrays.sort(arr);

        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
