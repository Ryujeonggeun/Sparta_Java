package week02;

public class ternary_operator {
    public static void main(String[] args) {
//        - 삼항 연산자
//                - 비교 연산의 결과값에 따라 응답할 값을 직접 지정할 수 있는 연산자입니다.
//        - 삼항 연산자는 3가지 피연산자가 존재하여 삼항 연산자라고 합니다. (`조건`/`참결과`/`거짓결과`)
//        - `(조건)` `?` `(참 결과)` `:` `(거짓 결과)`

        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "정답" : "땡" ;
        System.out.println(s);

        int max = (x > y) ? x : y ;
        System.out.println(max);

        int min = (x < y) ? x : y ;
        System.out.println(min);


    }
}
