public class NotSameNum {
    public static void main(String[] args){
        int[] arr = {1,1,3,3,0,1,1};

        for(int i=0; i<solution(arr).length; i++){
            System.out.println(solution(arr)[i]);
        }
    }

    public static int[] solution(int[] arr){
        int[] answer = new int[arr.length];
        int index =0;

        for(int i=0; i<arr.length; i++){
            if(i == index){
                answer[index] = arr[i];
            } else if(answer[index] != arr[i]){
                answer[index+1] = arr[i];
                index++;
            }
        }

        int[] answer2 = new int[index+1];

        for(int i=0; i<=index; i++){
            answer2[i] = answer[i];
        }

        return answer2;
    }
}