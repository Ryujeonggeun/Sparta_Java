package week02;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
        public static void main(String[] args) {
            // Queue : FIFO
            // add, peak(조회) , poll(꺼내기)
            // Queue : 생성자가 없는 인터페이스 <-

            Queue<Integer> intQueue = new LinkedList<>(); // queue를 선언,생성
            intQueue.add(1);
            intQueue.add(5);
            intQueue.add(9);

            while (!intQueue.isEmpty()) {
                System.out.println(intQueue.poll());
            }

            System.out.println(intQueue.peek()); // null

            //다시추가
            intQueue.add(1);
            intQueue.add(5);
            intQueue.add(9);

            //peak
            System.out.println(intQueue.peek());
            System.out.println(intQueue.size());



        }
    }

