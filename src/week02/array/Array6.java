package week02.array;

public class Array6 {
    public static void main(String[] args) {
        // 가변 배열
        int[][] array = new int[3][];

        // 배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

        //중괄호로 초기화를 아예 해버릴 때도 가능함!!

        int[][] array2 = {
                {10 ,20},
                {10,20,30,40},
                {10},
        };

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }


    }
}
