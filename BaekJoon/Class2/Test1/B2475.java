package BaekJoon.B2475;

import java.util.Arrays;
import java.util.Scanner;

// next() : 문자 혹은 문자열을 공백 기준으로 한 단어, 혹은 한 문자씩 입력을 받는다.
//nextLine() : 문자 혹은 엔터를 치기 전까지의 문장 전체를 입력받는다. '\n'을 포함하는 한 라인을 읽고, '\n'을 버린 나머지만 리턴한다.

//문자열변수명.substring(시작지점, 끝지점) : 시작지점 ~ (끝지점-1)까지 자른다.
//split(String regex): 특정 문자열을 파라미터로 받아서 해당 문자열을 기준으로 문자열을 잘라 String 배열에 넣어주는 기능을 한다.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        String numbers = sc.nextLine();
        String[] nums = numbers.split(" ");

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(nums[i]);
            num[i] *= num[i];
            sum += num[i];
        }

        System.out.println(sum%10);
    }
}
package BaekJoon.B2475;

import java.util.Arrays;
import java.util.Scanner;

// next() : 문자 혹은 문자열을 공백 기준으로 한 단어, 혹은 한 문자씩 입력을 받는다.
//nextLine() : 문자 혹은 엔터를 치기 전까지의 문장 전체를 입력받는다. '\n'을 포함하는 한 라인을 읽고, '\n'을 버린 나머지만 리턴한다.

//문자열변수명.substring(시작지점, 끝지점) : 시작지점 ~ (끝지점-1)까지 자른다.
//split(String regex): 특정 문자열을 파라미터로 받아서 해당 문자열을 기준으로 문자열을 잘라 String 배열에 넣어주는 기능을 한다.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        String numbers = sc.nextLine();
        String[] nums = numbers.split(" ");

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(nums[i]);
            num[i] *= num[i];
            sum += num[i];
        }

        System.out.println(sum%10);
    }
}
