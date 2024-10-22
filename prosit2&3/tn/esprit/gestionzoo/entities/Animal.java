package tn.esprit.gestionzoo.entities;


public class Animal {
    private String family;
    String name;
    private int age;
    private boolean isMammal;

    // Constructor
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); 
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Family = " + family + ", Name = " + name + ", Age = " + age + ", Is Mammal? " + isMammal;
    }
}