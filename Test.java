import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(5, 15)));

    }
}

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total/num - (num-1) / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }

        return answer;
    }
}