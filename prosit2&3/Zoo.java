public class Zoo {
    Animal [] animals;
    String name;
    String city;
    final int NBRCAGES = 25;
    int nbAnimaux = 0;

    Zoo(String name, String city) {
        animals = new Animal[NBRCAGES];
        this.name = name;
        this.city = city;
    }

    public boolean addAnimal(Animal animal) {
       if (isZooFull()) {
            return false;
        }
        if (searchAnimal(animal) != -1) {
            return false;
        }
        animals[nbAnimaux] = animal;
        nbAnimaux++;
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i=0; i < nbAnimaux; i++) {
            if (animals[i].name == animal.name) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < nbAnimaux - 1; i++) {
                animals[i] = animals[i + 1];
            }   
            animals[nbAnimaux - 1] = null;
            nbAnimaux--;
            return true;
        } else 
            return false;
    }
    
    public boolean isZooFull() {
        return nbAnimaux >= NBRCAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbAnimaux > z2.nbAnimaux) {
            return z1;
        } else if (z1.nbAnimaux < z2.nbAnimaux) {
            return z2;
        } else {
            System.out.println("même nombre");
            return null;
        }
    }

    public void afficher() {
        for (int i=0; i < nbAnimaux; i++) {
            System.out.println(animals[i]);
        }
    }

    public String toString() {
        return "name =" + this.name+" city =" + this.city;
    }
}
