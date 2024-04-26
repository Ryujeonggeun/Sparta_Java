package week02;

public class Stack {

    public static void main(String[] args) {
        //stack
        //수직으로 값을 쌓아놓고, 넣었다가 뺀다. FILO(Basket)
        //push, peak, pop
        //최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용
        java.util.Stack<Integer> intStack = new java.util.Stack<Integer>(); //선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // 다 지워질 때 까지 출력

        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop()); // 바스켓의 맨 위의 것 빼주기
        }

        //다시 추가

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        //peak
        System.out.println(intStack.peek()); // 그냥 조회만 하기
        System.out.println(intStack.size());

    }


}
