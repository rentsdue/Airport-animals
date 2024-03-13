import java.util.ArrayList;

public class AnimalShelter {
    /* A list of animals at the shelter, sorted by the age of the animal when it arrived at the
    shelter, from least to greatest
    Guaranteed not to be null and to contain only non-null entries
 */

    private ArrayList<Animal> allAnimals;

    public AnimalShelter(ArrayList<Animal> allAnimals) {
        this.allAnimals = allAnimals;
    }
 

    /* Creates and returns a new Animal object, as described in part (a) */

    public Animal createNewAnimal(String name, String type, double age) {
        Animal animal1 = new Animal (name, type, age, 0);
        int noOfType = 0;
        for (Animal a: allAnimals) {
            if (a.getType().equals(type)) {
                noOfType++;
            }
        }
        int cost = animal1.getCost(); 
        if (animal1.getAge() < 1) {
            if (noOfType < 5) {
                cost += 25;
            } else {
                cost += 20;
            }
        } else {
            cost += 15;
        }
        Animal animal2 = new Animal (name, type, age, cost);
        return animal2;
    }

 
    /** Adds an animal to the list allAnimals, as described in part (b) */

    public void addAnimal(String name, String type, double age) {  
        Animal a = createNewAnimal(name, type, age);
        allAnimals.add(a);

        // Sorting time
        for (int i = 0; i < allAnimals.size() - 1; i++) {
            for (int j = 0; j < allAnimals.size() - i - 1; j++) {
                if (allAnimals.get(j).getAge() > allAnimals.get(j+1).getAge()) {
                    Animal temp = allAnimals.get(j);
                    allAnimals.set(j, allAnimals.get(j+1));
                    allAnimals.set(j+1, temp);
                }
            }
        }

    }
}
