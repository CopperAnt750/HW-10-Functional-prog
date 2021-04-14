package com;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Human(23, "Valera", Gender.Male);
        Human h2 = new Human(15, "Nikitos", Gender.Male);
        Human h3 = new Human(28, "Olga", Gender.Female);
        Human h4 = new Human(12, "Yana", Gender.Female);
        Human h5 = new Human(55, "Afanasii", Gender.attackHelicopter);
        Human h6 = new Human(77, "Ivan", Gender.Male);


        Stream.of(h1, h2, h3, h4, h5, h6).filter(element -> element.getAge() > 18 & element.getAge() < 60).forEach(System.out::println);
    }
}
