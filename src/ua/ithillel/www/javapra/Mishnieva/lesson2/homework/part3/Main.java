package ua.ithillel.www.javapra.Mishnieva.lesson2.homework.part3;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        double[] array = {new Square(2, 5).area(), new Circle(2).area(), new Triange(6,3).area()};

        double sum = 0;
        for (double arrays : array) {
            sum += arrays;
        }
        String doubleSum = new DecimalFormat("#0.00").format(sum);
        System.out.println("Площа всіх фігур = " + doubleSum + " cм");

    }
}
