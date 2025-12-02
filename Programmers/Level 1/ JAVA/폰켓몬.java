import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length/2;
        
        nums = Arrays.stream(nums).distinct().toArray(); //중복제거
        
        if(nums.length >= n){
            return n;
        } else {
            return nums.length;
        }
        
    }
}
