package com;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.Gender.*;


public class Main {
    public static void main(String[] args) {

        Human h1 = new Human(23, "Valera", MALE);
        Human h2 = new Human(15, "Nikitos", MALE);
        Human h3 = new Human(28, "Olga", FEMALE);
        Human h4 = new Human(12, "Yana", FEMALE);
        Human h5 = new Human(55, "Afanasii", ATTACK_HELICOPTER);
        Human h6 = new Human(77, "Ivan", MALE);


        Stream.of(h1, h2, h3, h4, h5, h6).filter(element -> element.getAge() > 18 & element.getAge() < 60). collect(Collectors.toSet()).forEach(System.out::println);
    }
}
