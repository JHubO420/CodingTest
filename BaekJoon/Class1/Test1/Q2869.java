package BaekJoon.Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //int day = 0;

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        //(day−1)×(A−B)+A≥V
        int day = (V - B - 1) / (A - B) + 1;  // 수식 적용

        /*while (V>0){
            V -= A;
            if(V<=0){
                day++;
                break;
            }
            V += B;
            day++;
        }*/

        System.out.println(day);

    }
}
