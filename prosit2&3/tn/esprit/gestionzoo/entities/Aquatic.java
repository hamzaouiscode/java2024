package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic() {
        super();
        this.habitat = "";
    }

    public abstract void swim();

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; // Vérifie si obj est de la même classe

        Aquatic aquatic = (Aquatic) obj;
        return getName().equals(aquatic.getName()) &&  getAge() == aquatic.getAge() && habitat.equals(aquatic.habitat);
    }
}
