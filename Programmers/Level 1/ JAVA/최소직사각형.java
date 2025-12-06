import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        int n = 0;

        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                n = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = n;
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            if(w < sizes[i][0]){
                w = sizes[i][0];
            }
        }
        for (int i = 0; i < sizes.length; i++) {
            if(h < sizes[i][1]){
                h = sizes[i][1];
            }
        }
        return w*h;
    }
}
