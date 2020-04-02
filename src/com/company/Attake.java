package com.company;

public class Attake extends  Hero{
    private String blowSword;

    public Attake(int health, String name, String typeofattack, String blowSword) {
        super(health, name, typeofattack);
        this.blowSword = blowSword;
    }

    public String getBlowSword() {
        return blowSword;
    }

    public void setBlowSword(String blowSword) {
        this.blowSword = blowSword;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Удар мечом" + getBlowSword());

    }
}
