package java01;

import java.util.Scanner;

public class beakjoon2751_fail {   // 시간초과로 실패
	public static void main(String[] args) {
	
	int i,j;
	int tmp = 0;	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int[] x = new int[n];
	
	for(i = 0; i < n; i++) {
		x[i] = sc.nextInt();
		// System.out.println(x);
	}
	for(i = 0; i < n; i++) {
		for(j = 0; j < n-1; j++) {
			if(x[j] > x[j+1]) {
				tmp = x[j];
				x[j] = x[j+1];
				x[j+1] = tmp;
			}
			else {
				continue;
			}
		}
	}
	
	for(i =0;i<n;i++) {
		System.out.println(x[i]);
	}
	}
}
