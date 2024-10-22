package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public Aquatic() {
        super();
        this.habitat = "";
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("L'animal aquatique nage.");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }
}
