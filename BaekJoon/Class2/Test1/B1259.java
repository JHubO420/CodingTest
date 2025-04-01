package BaekJoon.B1259;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();

        int i = 0;

        // "0"을 입력받을 때까지 반복
        do {
            String input = sc.next();  // 입력값 받기
            if (input.equals("0")) break;  // "0" 입력 시 종료
            //문자열 비교를 할 때 != 연산자를 사용하면 참조 비교가 이루어집니다.
            //이때, 문자열 비교는 ==와 !=이 아닌 equals() 메서드를 사용해야 올바르게 비교됩니다.
            arr.add(input);  // 리스트에 단어 추가
            i++;  // 증감식
        } while (true);
        //현재 코드에서는 "0"을 입력받았을 때 그 전까지의 단어들이 모두 arr에 저장되며 "0"을 입력한 뒤 루프를 종료하고,
        // 이후 팰린드롬 검사도 "0"을 포함한 결과로 나올 수 있습니다.

        // 각 단어에 대해 팰린드롬 여부를 체크
        for (int j = 0; j < arr.size(); j++) {
            String word = arr.get(j);//배열의 문자열 한개씩 넣기
            int left = 0;
            int right = word.length() - 1;

            boolean isPalindrome = true;
            // 앞과 뒤에서 하나씩 비교
            while (left < right) {
                //각 단어에 대해 두 포인터(left와 right)를 사용하여 앞과 뒤에서부터 문자를 비교합니다.
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;//서로 다르면 그 즉시 false로 종료
                    break;
                }
                left++;
                right--;//맞으면 다음 단어끼리 비교
            }

            // 결과 리스트에 'yes' 또는 'no' 추가
            if (isPalindrome) {
                s.add("yes");
            } else {
                s.add("no");
            }
        }

        // 결과 출력
        for (String result : s) {
            System.out.println(result);
        }
    }
}

