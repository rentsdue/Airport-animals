public class Flight {
    
    private double price;
    private int numPassengers;
    private int capacity;

    public Flight(int numPassengers, double price, int capacity) {
        this.price = price;
        this.numPassengers = numPassengers;
        this.capacity = capacity;
    }

    public double getPrice() {
        return this.price; //Must be greater than 0.0
    }

    public void setPrice(double price) {
        this.price = price; 
    }

    public int getNumPassengers() {
        return this.numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public int getCapacity() {
        return this.capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}
