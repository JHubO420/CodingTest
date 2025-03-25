import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        //배열 자체를 ArrayList에 값으로 저장 가능
        ArrayList<int[]> mass = new ArrayList<int []>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            //배열을 ArrayList에 저장
            mass.add(new int[] {weight, height});
        }

        int[] rank = new int[n];
        for (int i = 0; i < n; i++)
            rank[i] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                // 작은 경우
                //ArrayList의 값 불러와서 비교
                if (mass.get(i)[0] < mass.get(j)[0] && mass.get(i)[1] < mass.get(j)[1])
                    rank[i]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(rank[i]);
            if (i < rank.length - 1) {
                sb.append(" "); // 요소 사이에 공백 추가
            }
        }
        System.out.println(sb.toString());
    }
}
