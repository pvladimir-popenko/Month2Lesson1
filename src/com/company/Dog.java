package com.company;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] comands;

    public Dog() {}

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.setColor(color);
        this.setShelter(shelter);
    }

    public Dog(String name, String breed, String[] comands, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.comands = comands;
        this.setShelter(shelter);
        this.setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getComands() {
        return comands;
    }

    public void setComands(String[] comands) {
        this.comands = comands;
    }

    public void makeVoice(String voice, int number){
        voice = "Тяв тяв";
        for (int i = 0; i<number; i++){
            System.out.println(voice);
        }
    }

    public void makeVoice(){

    }

    public String getInfoDog(){
        return getName()  + "\n" + getBreed() + "\n" + getComands()
                +super.getInfo();
    }

}
