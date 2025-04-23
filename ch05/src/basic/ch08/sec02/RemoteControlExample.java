package basic.ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc; // 인터페이스 타입 변수

        rc = new Television();  // Television 객체 할당
        rc.turnOn();            // TV를 켭니다

        rc = new Audio();       // Audio 객체 할당
        rc.turnOn();            // Audio를 켭니다
    }
}
