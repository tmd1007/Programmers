import java.util.Arrays;

class Lessons {
    public static void main(String[] args){
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(9, 2, 1, 3)));
    }
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int n = numer1 * denom2 + numer2 * denom1;
        int d = denom1 * denom2;

        int numer = n / Algorithm.algo(n, d);

        int denom = d / Algorithm.algo(n, d);

        int[] answer = {numer, denom};

        return answer;
    }
}

class Algorithm {
    public static int algo(int n, int k) {
        int r = n % k;

        if(r == 0)
            return k;

        return algo(k, r);
    }
}