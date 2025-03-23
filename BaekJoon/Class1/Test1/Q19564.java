import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 입력받기
        //rstrip() → trim()으로 변환
        //rstrip()은 오른쪽 공백 제거, trim()은 양쪽 공백 제거이므로 같은 기능 수행 가능.
        String S = br.readLine().trim();

        int L = 1; // 초기값 설정

        // 문자열 길이만큼 반복
        for (int i = 1; i < S.length(); i++) {
            // 현재 문자(S.charAt(i))가 이전 문자(S.charAt(i - 1))보다 작거나 같다면 L 증가
            if (S.charAt(i) <= S.charAt(i - 1)) {
                L++;
            }

        }

        br.close(); // 리소스 닫기
        // 결과 출력
        System.out.println(L);
    }
}
