package com.company;

public class Simple extends Hero {
        private String wearsItems;


    public Simple(int health, String name, String typeofattack, String wearsItems) {
        super(health, name, typeofattack);
        this.wearsItems = wearsItems;
    }

    public String getWearsItems() {
        return wearsItems;
    }

    public void setWearsItems(String wearsItems) {
        this.wearsItems = wearsItems;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Носит предметы" + getWearsItems());

    }
}
