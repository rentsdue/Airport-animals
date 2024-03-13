public class Animal {
    
    private String name;
    private String type;
    private double age;
    private int cost;
    private int interest;

    public Animal(String name, String type, double age, int cost) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.cost = cost;
    }

    public Animal(String name, String type, double age, int cost, int interest) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.cost = cost;
        this.interest = interest;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getInterest() {
        return this.interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }
    

}
