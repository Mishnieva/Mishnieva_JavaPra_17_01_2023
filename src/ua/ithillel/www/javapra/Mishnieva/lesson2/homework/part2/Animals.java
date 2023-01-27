package ua.ithillel.www.javapra.Mishnieva.lesson2.homework.part2;

public abstract class Animals {

    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void swim(int distance){
        System.out.println("Animals can swim " + distance);
    }
    public void run(int distance) {
        System.out.println("Animals can run " + distance);
    }
}
