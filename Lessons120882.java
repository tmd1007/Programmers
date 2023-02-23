import java.util.Arrays;

public class Lessons120882 {
}


class Solution120882 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Arrays.fill(answer, 1);
        int temp = 0;

        for(int i=0; i < score.length; i++) {
            temp = score[i][0] + score[i][1];
            for(int j=0; j < score.length; j++) {
                if(temp < score[j][0] + score[j][1]) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}