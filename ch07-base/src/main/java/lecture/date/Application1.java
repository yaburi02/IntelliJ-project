package lecture.date;

import lombok.Data;

import java.util.Calendar;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        //date연도 설정 문제
        Date legacyDate = new Date();
        legacyDate.setYear(2025);
        System.out.println("Date setYear(2025) -> 실제출력: " + legacyDate);

        //Calender 0월부터 시작
        Calendar cal = Calendar.getInstance();
        cal.setTime(year: 2025, month:4, date:24);
        System.out.println("Calender.set(2025,3,23)->실제 우ㅡㅓㄹ : " + cal.getTime());
    }
}
