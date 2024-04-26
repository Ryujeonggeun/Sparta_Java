package week02;

import java.util.LinkedList;

public class List2 {
    public static void main(String[] args) {
        // Linked List
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아 놓음
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조

        //기본적 기능은 -> ArrayList와 동일!
        //LinkedList는 값을 여기저기 나누어서 조회하는 속도가 느리다
        //대신 값을 추가하거나 삭제할 때는 빠름

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.toString()); // 조회할 때 속도가 현저히 느림 그냥 리스트보다
        //추가
        linkedList.add(200);
        System.out.println(linkedList.toString());
        //n번째에 추가
        linkedList.add(2,4);
        System.out.println(linkedList.toString());
        //n번째 변겅
        linkedList.set(1,30);
        System.out.println(linkedList.toString());
        //n번째 삭제
        linkedList.remove(1);
        //전체 삭제
        linkedList.clear();

    }
}
