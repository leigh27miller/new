// interface= names of the rules that the methods will follow
//start with abstract class

public abstract class Vehicle{
    //absract is a class that has at least one abstract method in it
    //this means that an abstract class cannot be instantiated on its own 
    //abstract enforces a child class
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(){}

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;

    }

    protected abstract void drive();
    //child class will explain line above
    //void = do nothing/it's empty


}