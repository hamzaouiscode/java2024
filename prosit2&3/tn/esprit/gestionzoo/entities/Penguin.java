package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }

    public void swim() {
        System.out.println("This penguin is swimming at a depth of " + swimmingDepth + " meters.");
    }
    
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
}
