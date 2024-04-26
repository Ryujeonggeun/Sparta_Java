package week02.array;

public class Array7 {
    public static void main(String[] args) {
        //최대값 구하기
        int[] arr = {3,2,1,5,1};

        //최대값 초기화 세팅
        int max = arr[0];

        //최대값 구하기 로직
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //향상된 for 문 최대값 구하기
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
