public class Lessons120812 {    // 최빈값 구하기
    public static void main(String[] args) {
        int[] array = {0,0,1,1,2,2,2};

        Solution120812 sol = new Solution120812();

        System.out.println(sol.solution(array));
    }
}

class Solution120812 {
    public int solution(int[] array) {
        int answer = 0;
        int[] elements = new int[1000];
        int index, max = 0 , cnt = 0, over = 0;

        for (int i = 0; i < array.length; i++) {
            index = array[i];
            elements[index]++;
        }

        for (int i = 0; i < elements.length; i++) {
            if (cnt < elements[i]) {
                cnt = elements[i];
                max = i;
                over = 0;
            } else if (cnt != 0 && cnt == elements[i]) {
                over++;
            }
        }

        answer = max;

        return over == 0? answer : -1;
    }
}