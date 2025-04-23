package basic.ch08.lecture;

public class Product implements InterPreduct{
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이팅한 메소드 호출");
    }

    @Override
    public void absMethod() {
        System.out.println("InterProduct의 nonStatic");
    }
}
