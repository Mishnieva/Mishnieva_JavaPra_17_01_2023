package ua.ithillel.www.javapra.Mishnieva.lesson2.homework.part3;

import java.text.DecimalFormat;

public class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
    double area = Math.PI * Math.pow(radius,2);
    String doublearea = new DecimalFormat("#0.00").format(area);
    System.out.println("Площа кола дорівнює " + doublearea + " cм");
    return area;
    }



}
