package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin() {
        super();
        this.swimmingSpeed = 0.0f;
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public void swim() {
        System.out.println("Le dauphin nage.");
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }
}
