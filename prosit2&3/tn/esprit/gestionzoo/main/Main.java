package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main{
    public static void main(String[] args) {
    Animal lion = new Animal("Felines", "Lion", 50, true);
    Zoo myZoo = new Zoo("myZoo", "Tunis");
    System.out.println(myZoo.toString());
    }
}