import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int s = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(s);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != s){
                list.add(arr[i]);
                s = arr[i];
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
