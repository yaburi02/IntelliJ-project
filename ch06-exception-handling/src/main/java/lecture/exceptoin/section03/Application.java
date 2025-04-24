package lecture.exceptoin.section03;

import java.io.BufferedReader;
import java.io.FileReader;

public class Application {
    public static void main(String[] args) {
        //BufferedReader: 파일을 읽어오는 클래스

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    System.out.println("정상작동핑");
    }
}
