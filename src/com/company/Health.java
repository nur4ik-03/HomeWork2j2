package com.company;

public class Health extends Hero {
    private int healing;


    public Health(int health, String name, String typeofattack, int healing) {
        super(health, name, typeofattack);
        this.healing = healing;
    }



    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Исцеление" + getHealing());

    }
}
