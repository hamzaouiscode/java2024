package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private final int NBRCAGES = 25;
    private final int MAXAQUA = 10;
    private int nbAnimaux = 0;
    private int nbAquaticAnimals = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        animals = new Animal[NBRCAGES];
        aquaticAnimals = new Aquatic[MAXAQUA];
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
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

    public boolean isAquaticZooFull() {
        return nbAquaticAnimals >= MAXAQUA;
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[nbAnimaux] = animal;
            nbAnimaux++;
            if (animal instanceof Aquatic && !isAquaticZooFull()) {
                aquaticAnimals[nbAquaticAnimals] = (Aquatic) animal;
                nbAquaticAnimals++;
            }
            return true;
        } else {
            System.out.println("Le zoo est rempli.");
            return false;
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (!isAquaticZooFull()) {
            aquaticAnimals[nbAquaticAnimals] = aquatic;
            nbAquaticAnimals++;
            addAnimal(aquatic);
        } else {
            System.out.println("La partie aquatique est remplie.");
        }
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < nbAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("nb de dauphins: " + dolphinCount);
        System.out.println("nb de pinguins: " + penguinCount);
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index >= 0) {
            animals[index] = animals[nbAnimaux - 1];
            animals[nbAnimaux - 1] = null;
            nbAnimaux--;

            if (animal instanceof Aquatic) {
                removeAquaticAnimal((Aquatic) animal);
            }
            return true;
        } else {
            System.out.println("Animal not found.");
            return false;
        }
    }

    private void removeAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < nbAquaticAnimals; i++) {
            if (aquaticAnimals[i].getName().equals(aquatic.getName())) {
                aquaticAnimals[i] = aquaticAnimals[nbAquaticAnimals - 1];
                aquaticAnimals[nbAquaticAnimals - 1] = null;
                nbAquaticAnimals--;
                break;
            }
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

    public void displayAquaticAnimalsSwimming() {
        for (int i = 0; i < nbAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < nbAnimaux; i++) {
            if (animals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) animals[i];
                float currentDepth = penguin.getSwimmingDepth();
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
            }
        }

        return maxDepth;
    }

    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + "]";
    }
}
