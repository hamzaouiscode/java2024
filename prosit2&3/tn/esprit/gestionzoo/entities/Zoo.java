package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBRCAGES = 25;
    private int nbAnimaux = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        animals = new Animal[NBRCAGES];
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Zoo name cannot be empty.");
        }
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public boolean isZooFull() {
        return nbAnimaux >= NBRCAGES;
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[nbAnimaux] = animal;
            nbAnimaux++;
            return true;
        } else {
            System.out.println("The zoo is full, cannot add more animals.");
            return false;
        }
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index >= 0) {
            animals[index] = animals[nbAnimaux - 1];
            animals[nbAnimaux - 1] = null;
            nbAnimaux--;
            return true;
        } else {
            System.out.println("Animal not found.");
            return false;
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimaux; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public void afficher() {
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println(animals[i]);
        }
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + "]";
    }
}
