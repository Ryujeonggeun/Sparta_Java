package homework;

import java.util.*;

public class two_week {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 저장할 자료 구조명을 입력
        System.out.print("저장할 자료구조(List/Set/Map: ");
        String array = sc.nextLine();

        //제목 입력
        System.out.print("제목을 입력하세요:");
        String title = sc.nextLine();

        //별점 입력
        System.out.print("별점을 입력하세요(5점만점): ");
        float rate = sc.nextFloat();
        sc.nextLine();

        // array 를 List로 입력받을 때, ListRecipe에 저장, 출력
        if (array.equals("List")) {
            ArrayList<String> ListRecipe = new ArrayList<>();
            while (true) {
                System.out.print("레시피를 입력하세요: " );
                String text = sc.nextLine();
                ListRecipe.add(text);
                if (text.equals("끝")) {
                    break;
                }
            }  // 출력
            for (int i = 0; i < ListRecipe.toArray().length; i++) {
                System.out.println((i + 1) +"."+ ListRecipe.get(i));
            }
        }

        //array를 Set으로 입력 받았을때, SetRecipe에 저장
        if (array.equals("Set")) {
            Set<String> SetRecipe = new HashSet<>();
            while (true) {
                System.out.print("레시피를 입력하세요: " );
                String text = sc.nextLine();
                SetRecipe.add(text);
                if (text.equals("끝")) {
                    break;
                }
            }//SetRecipe 출력
            Iterator iterator = SetRecipe.iterator();
            for (int i = 0; i < SetRecipe.size(); i++) {
                System.out.println((i + 1) +"."+ iterator.next());
            }
        }

        //array를 Map으로 입력 받았을때, MapList에 저장
        if (array.equals("Map")) {
            Map <Integer, String> MapList = new HashMap<>();
            int mapNumber = 1;

            while (true) {
                System.out.print("레시피를 입력하세요: " );
                String text = sc.nextLine();
                // key 값 임시설정
               MapList.put(mapNumber++,text);

                if (text.equals("끝")) {
                    break;
                }
            }
            //MapList 출력
            for (int i = 0; i < MapList.size(); i++) {
                System.out.println((i + 1) +"."+MapList.get(i + 1) );
            }
        }

        //제목 출력
        System.out.println( "[ " + array + "으로 저장된 " +  title + " ] ");
        //평점 출력
        System.out.println("별점:" + rate + "(" + rate / 5 * 100 + "%)"  );






    }
}
