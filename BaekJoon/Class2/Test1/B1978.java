package BaekJoon.B1978;

import java.util.ArrayList;
import java.util.Scanner;

//소수 찾기 문제
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;

        n = sc.nextInt();

        // nextInt()로 숫자를 읽고 난 뒤,
        // nextLine()을 호출하면 버퍼에 남은 개행 문자(\n)가 nextLine()에 의해 읽히게 되어, 의도한 대로 문자열을 읽지 못하게 됩니다.
        // nextInt()로 입력 후 개행 문자가 남으므로 이를 소비하는 nextLine() 호출
        sc.nextLine();  // 여기에서 개행 문자 소비

        // 문자열 입력 받기
        String num = sc.nextLine();

        // 공백 없이 각 문자로 나누어 배열로 저장
        String[] numbers = num.split(" ");

        // 개수를 기반으로 배열 크기 설정
        int[] nums = new int[n];

        // 문자열 배열을 정수 배열로 변환하여 nums에 저장
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int con = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if(nums[i]%j==0){
                    con++;
                }
            }
            if(con==2){
                count++;
            }
        }

        System.out.println(count);
    }
}
