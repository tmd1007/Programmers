import java.util.Arrays;

public class Lessons120923 {    // 연속된 수의 합
    public static void main(String[] args) {

        Solution120923 s = new Solution120923();

        System.out.println(Arrays.toString(s.solution(5, 15)));

    }
}

class Solution120923 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total/num - (num-1) / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }

        return answer;
    }
}