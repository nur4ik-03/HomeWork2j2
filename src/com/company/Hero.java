package com.company;

public class Hero implements Printable{
    private int health;
    private String name;
    private String typeofattack;

    public Hero(int health, String name, String typeofattack) {
        this.health = health;
        this.name = name;
        this.typeofattack = typeofattack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeofattack() {
        return typeofattack;
    }

    public void setTypeofattack(String typeofattack) {
        this.typeofattack = typeofattack;
    }

    @Override
    public void print() {
        System.out.println("Здоровье " + getHealth() + " " + " Имя " + getName() + " " + " Тип аттаки " + getTypeofattack());

    }
}
