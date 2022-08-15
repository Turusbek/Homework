package com.company;

public class Dog extends Home {
private String name;
private int age;
private Color color;

    public Dog(String address, String name, int age, Color color) {
        super(address);
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }
    public String getInfo(){
        return "Address:" + getAddress()+
                "\nName:" + getName()+
                "\nAge:" + getAge() +
                "\nColor:" + getColor();
    }
    public void makeVoice(){
        System.out.println("gav gav");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }


}
