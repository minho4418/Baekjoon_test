package java01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 
 
public class beakjoon2751 {	
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); // 변경가능한 문자열을 만들어줌.
		
		int N = in.nextInt();
		
		// list 계열 중 하나를 쓰면 된다.
		ArrayList<Integer> list = new ArrayList<>(); // 선형리스트
		
		for(int i = 0; i < N; i++) {
			list.add(in.nextInt());
		}
		
		Collections.sort(list);
		
		// Arrays.sort() VS Collections.sort()
		// Array는 메모리적으로 각 값들이 연속적인 주소를 가지고 있기 때문에 
		// C의 값이 낮습니다. 그래서 참조 지역성이 좋은 퀵 정렬을 이용하면 
		// 충분한 성능을 제공할 수 있다고 합니다. 
		// 하지만 Collection은 List를 기준으로 봤을때 메모리간 인접한 
		// ArrayList 뿐만 아니라 메모리적으로 산발적인 LinkedList도 함께 존재합니다.
		// 따라서 참조 인접성이 좋지 않고 C의 값이 상대적으로 높다고 합니다. 
		// 이럴 때는 퀵 정렬 보다는 합병정렬과 삽입정렬을 병합한 
		// Tim 정렬을 이용하는게 평균적으로 더 좋은 성능을 기대할 수 있다고합니다.
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}