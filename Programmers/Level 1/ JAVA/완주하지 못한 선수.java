import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        String[] p = participant;
        String[] c = completion;

        Arrays.sort(p);
        Arrays.sort(c);

        for (int i = 0; i < c.length; i++) {
           if(!p[i].equals(c[i])){
               answer = p[i];
               return answer;
           }
        }

        answer = p[p.length-1];
        return answer;
    }
}
