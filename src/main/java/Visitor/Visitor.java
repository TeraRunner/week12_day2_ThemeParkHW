package Visitor;

public class Visitor {

    private String name;
    private double height;
    private double money;
    private int age;

    public Visitor(String name, double height, double money, int age) {
        this.name = name;
        this.height = height;
        this.money = money;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

}
