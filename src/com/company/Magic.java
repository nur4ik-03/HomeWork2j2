package com.company;

public class Magic extends Hero {
    private String hypnosis;

    public Magic(int health, String name, String typeofattack, String hypnosis) {
        super(health, name, typeofattack);
        this.hypnosis = hypnosis;
    }

    public String getHypnosis() {
        return hypnosis;
    }

    public void setHypnosis(String hypnosis) {
        this.hypnosis = hypnosis;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Гипноз" + getHypnosis());

    }
}
