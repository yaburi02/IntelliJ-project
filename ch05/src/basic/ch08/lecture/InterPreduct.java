package basic.ch08.lecture;

public interface InterPreduct {
    // 인터페이스는 상수 필드만 작성 가능
    //public static final -> 조합을 상수 필드
    //

    // public static final int a = 0;
    // public static final이 숨은가임
     int MIN_NUM = 10;
     int MAX_NUM = 100;

    // 생성자를 가질 수 없음
    //public InterProduct(){}


    // 인터페이스는 구현부가 있는 메서드를 가질 수 없다
    // poblic void nonStaticMethod(){}

    //static 메서드는 가질 수 있다
    public static void staticMethod() {
        System.out.println("InterPreduct 인터페이스에서 staticMethod호출됨");
    }
    //추상메서드만 작성 가능
    public abstract void nonStaticMethod();

    //인터페이스 안에 작성한 메소드는 public abstract의 의미를 가진다
    //인터페이스를 상속받은 클래스는 메소드를 구현할 때 접근제어자를 public으로 해야지 구현 가능
    void absMethod();

    //인터페이스에서 일반 메소드를 만들기 위해서는 default 키뭐드를 붙여야한다

//    public default void defaultMethod() {
//        System.out.
//    }
}
