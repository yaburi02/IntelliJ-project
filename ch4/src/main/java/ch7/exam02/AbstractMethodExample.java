package ch7.exam02;

    public class AbstractMethodExample {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.sound(); // 멍멍

            Cat cat = new Cat();
            cat.sound(); // 야옹

            animalSound(new Dog()); // 멍멍
            animalSound(new Cat()); // 야옹
        }

        // Animal 타입 매개변수를 받아 sound 호출하는 메서드
        public static void animalSound(Animal animal) {
            animal.sound(); // 다형성
        }
    }