import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Flights
        Flight f1 = new Flight (25, 50.00, 30);
        Flight f2 = new Flight (10, 100.50, 60);
        Flight f3 = new Flight (50, 200.00, 40);
        Flight f4 = new Flight (20, 100.00, 120);

        //Test methods
        ArrayList <Flight> list = new ArrayList<Flight>(Arrays.asList(f1, f2, f3, f4));
        Airport a1 = new Airport(list);
        double answer1= a1.getTotalRevenue();
        int answer2 = a1.updateFlights();
        System.out.println(answer1 + " " + answer2);

        //Test question 2
        Animal goku = new Animal ("Goku", "Monkey", 5.0, 6);
        Animal loku = new Animal ("Loku", "Monkey", 8.0, 5);
        Animal boku = new Animal ("Boku", "Monkey", 0.1, 100);
        Animal morbius = new Animal ("Morbius", "Monkey", 0.6, 65);
        Animal naruto = new Animal ("Naruto", "Monkey", 10, 64);

        Animal bark = new Animal ("Bark", "Dog", 0.5, 69);
        ArrayList <Animal> all = new ArrayList<Animal>(Arrays.asList(goku, loku, boku, morbius, naruto, bark));
        AnimalShelter shelter = new AnimalShelter(all);
        Animal max = shelter.createNewAnimal("Max", "Monkey", 0.1);
        System.out.println(max.getCost());
        Animal dax = shelter.createNewAnimal("Dax", "Dog", 0.7);
        System.out.println(dax.getCost());
        Animal bax = shelter.createNewAnimal("Bax", "Bat", 444);
        System.out.println(bax.getCost());

        shelter.addAnimal("Terry Crews", "Dinosaur", 420);
        for (Animal animal: all) {
            System.out.println(animal.getAge());
        }
    }
}