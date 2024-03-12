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
    }
}