package basic.ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample3 {

    public static void main(String[] args) {

        // 익명 클래스 : 이름 없이 인터페이스 나 추상크래스를 즉석에서 구현하는 클래스
        // 익명 객체 : 익명클래스로 만든 객체

        // Thread 클래스로 run()을 구현하는 경우 상속으로 하기 때문에
        // 추가로 다른 기능들을 상속 할 수 없음
        // 오직 한가지 일만 스레드와 연결됨
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for ( int i = 0; i < 5; i++) {
                    toolkit.beep();

                    try {
                        Thread.sleep(500);
                    } catch (Exception e ) {
                        // 예외가 발생한 위치 경로를 알려줌 (콘솔에 출력)
                        e.printStackTrace();
                    }
                }
            }
        };

        // 별도의 작업스레드 생성
        thread.start();

        // 메인스레드에서는 for문 동작
        for(int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}