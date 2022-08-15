package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Dog dog = new Dog("Osh","Dog",1,Color.BROWN);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("guv guv");
        System.out.println("----------");
        Cat cat = new Cat("Bishkek","Cat",2,Color.BLACK);
        System.out.println(cat.getInfo());
        dog.makeVoice();
        dog.makeVoice("mmm");
        System.out.println("----------");
        Chikken chikken = new Chikken("Batken","Chiken",4,Color.WHITE);
        System.out.println(chikken.getInfo());
        chikken.makeVoice();
        chikken.makeVoice("kkk");
    }
}
