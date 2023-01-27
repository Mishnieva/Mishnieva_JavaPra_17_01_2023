package ua.ithillel.www.javapra.Mishnieva.lesson2.homework.part1;

public class Employee {
    private String completeName;
    private String position;
    private String email;
    private String telehone;
    private int age;


    public Employee(String completeName, String position, String email, String telehone, int age) {
        this.completeName = completeName;
        this.position = position;
        this.email = email;
        this.telehone = telehone;
        this.age = age;
    }

    public String getCompleteName() {
        return completeName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelehone() {
        return telehone;
    }

    public int getAge() {
        return age;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelehone(String telehone) {
        this.telehone = telehone;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
