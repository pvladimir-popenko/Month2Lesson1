package com.company;

import java.util.Random;

public class Pet {
    private int age = generateRandomAge();
    private Shelter shelter;
    private Color color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int generateRandomAge(){
        Random r = new Random( 1);
        int age = r.nextInt(10);
        return age;
    }
    public String getInfo(){
        return getAge() + " " + getColor() + " " + getShelter() + " "
                + getShelter().getAddress() + " " + getShelter().getName();
    }
}
