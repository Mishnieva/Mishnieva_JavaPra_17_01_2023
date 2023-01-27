package ua.ithillel.www.javapra.Mishnieva.lesson2.homework.part2;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Шарік");
        Dog dog2 = new Dog("Бобік");
        Cat cat1 = new Cat("Матроскін");


        dog1.run(160);
        dog1.swim(8);
        dog2.run(650);
        dog2.swim(13);
        System.out.println();
        cat1.run(188);
        cat1.run(202);
        cat1.swim(0);

    }
}
