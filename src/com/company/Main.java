package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.getInfoDog();
        dog1.makeVoice();

        Dog dog2 = new Dog("Тузик",
                "Двортерьев",
                Color.WHITE,
                new Shelter("Милые питомцы",
                            "Абдымомунова 123"));
        dog2.getInfoDog();
        dog2.makeVoice();

        Dog dog3 = new Dog("Граф",
                            "Бульдог",
                new String[]{"Sit down", "Stay here", "Come on"},
                Color. BLACK,
                new Shelter("Тузиково", "Киевская 32"));
        dog3.getInfoDog();
        dog3.makeVoice("Гау", 5);



    }
}
