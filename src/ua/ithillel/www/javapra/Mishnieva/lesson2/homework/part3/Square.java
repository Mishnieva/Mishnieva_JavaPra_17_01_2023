package ua.ithillel.www.javapra.Mishnieva.lesson2.homework.part3;

public class Square implements Area {

    private int a;
    private int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        double area = a * b;
        System.out.println("Площа квадрата дорівнює " + area + " cм");
        return area;
    }
}
