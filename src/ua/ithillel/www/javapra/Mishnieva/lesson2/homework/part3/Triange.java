package ua.ithillel.www.javapra.Mishnieva.lesson2.homework.part3;

public class Triange implements Area{

    private double с;
    private double h;

    public Triange(double с, double h) {
        this.с = с;
        this.h = h;
    }

    public double getС() {
        return с;
    }

    public double getH() {
        return h;
    }

    @Override
    public double area() {
       double area = 0.5 * getС() * getH();
        System.out.println("Площа трикутника дорівнює " + area + " cм");
        return area;
    }
}
