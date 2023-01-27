package ua.ithillel.www.javapra.Mishnieva.lesson2.homework.part2;

public class Cat extends Animals{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(getName() + " не може пробігти більше 200 метрів");
        } else {
            System.out.println(getName() + " пробіг " + distance + " метрів");
        }
    }
    @Override
    public void swim (int distance) {
        System.out.println("Кіт " + getName() + " не вміє плавати");
    }
}
