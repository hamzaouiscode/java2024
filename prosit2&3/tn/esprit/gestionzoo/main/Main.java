package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main{
    public static void main(String[] args) {
        Animal Animal = new Animal();
        Aquatic Aquatic = new Aquatic();
        Terrestrial Terrestrial = new Terrestrial();
        Dolphin Dolphin = new Dolphin();
        Penguin Penguin = new Penguin();

        Animal Simba = new Terrestrial("Felin", "Simba", 5, true, 4);
        Dolphin Dolphinoux = new Dolphin("Dolphin Family", "Dolphinoux", 3, true, "Ocean", 25.5f);
        Penguin Kingpingu = new Penguin("Pinguin Family", "Kingpingu", 2, false, "Antarctic waters", 30.0f);
        Zoo myZoo = new Zoo("myZoo", "Tunis");
        System.out.println(myZoo.toString());

        Aquatic.swim();
        Dolphinoux.swim();
        Kingpingu.swim();
    }
}