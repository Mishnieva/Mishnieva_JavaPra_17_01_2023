package ua.ithillel.www.javapra.Mishnieva.lesson2.homework.part2;

public class Dog extends Animals{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println(getName() + " не може пробігти більше 500 метрів");
        } else {
            System.out.println(getName() + " пробіг " + distance + " метрів");
        }
    }
    @Override
    public void swim (int distance) {
        if (distance > 10) {
            System.out.println(getName() + " не може пропливти більше 10 метрів");
        } else {
            System.out.println(getName() + " проплив " + distance + " метрів");
        }
    }
}
