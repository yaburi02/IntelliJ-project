package ch7.sec10.lecture;

public abstract class Product {

    private int nonStaticField;
    private static int staticField;

    public Product() {
    }

    public abstract void abstMethod();

    public void nonStaticMethod() {
        System.out.println("추상클래스안의 nonStaticMethod() 호출됨 !");
    };

    public static void staticMethod() {
        System.out.println("추상클래스안의 staticMethod() 호출됨 !");
    };
}

