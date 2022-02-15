import java.util.Scanner;

public class beakjoon2577 { // 2022.02.07
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[3];
        int result = 1;
        int num2;
        int a=0;
        // System.out.println("100보다 크고 1000보다 작은 자연수를 입력해주세요");
        for(int i = 0; i < num.length;i++){
            num2 = scanner.nextInt();
            if(num2 >= 100 && num2 <1000){
                num[i] = num2;
                result *= num[i];
            }
            else{
                System.out.println("오류 다시 입력하세요");
                i--;
            }
        }
        // System.out.println(result);
        String str = Integer.toString(result);
        char[] result2 = str.toCharArray();
        for(int i = 0; i<10 ;i++){
            for(int j = 0; j<result2.length;j++){
                if(i == Character.getNumericValue(result2[j])){
                    a++;
                }
            }
            System.out.println(a);
            a = 0;
        }
    }
}
