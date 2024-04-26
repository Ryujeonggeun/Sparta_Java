package week03;

//클래스를 만들기 위한 4가지 STEP

// 1. 만들려고 하는 설계도를 선언한다.(클래스 선언)
// 2. 객체가 가지고 있어야할 속성(필드)을 정의한다.
// 3. 객체를 생성하는 방식을 정의한다. (생성자)
// 4. 객체가 가지고 있어야할 행위(메서드)를 정의한다.

public class Car {
    //=====================필드영영===================================
    String company; //자동차 회사
    String model; //자동차 모델
    String color; //자동차 색
    double price; //자동차 가격
    double speed; //자동차 속도, km/h

    char gear; // 기어상태(P,R,N,D)
    boolean lights; // 자동차 조명의 상태


    //============================생성자 영역=============================
        //생성자 : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    public Car() {
        //logic
        //기본생성자 : 생략이 가능
        System.out.println("생성자 호출 완료");
    }
   //=========================메서드 영역============================

        //gasPedal
        //intput : km/h
        //output : speed
        double gasPedal(double kmh){
            speed = kmh;
            return speed;
        }

        //breakPedal
        //input : x
        //output: speed
        double brakePedal() {
        speed = 0;
        return speed;
        }

        //chngeGear
        //input : gear(char type)
        //output: gear

     char changeGear (char type) {
        gear = type;
        return gear;
     }

        //onoffLight
        //input : x
        //output: lights(boolean)
    boolean onOffLights () {
        lights = !lights;
        return lights;
    }

        //horn
        // input : x
        // output: x

    void horn() {
        System.out.println("빵빵");
    }
    }



