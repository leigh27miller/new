public class Car extends Vehicle implements OilChange{
    //car class is child class of vehicle 
    //you can only extends one abstract class but can implement multiple interfaces
    //the implements inherits 
    public void drive() {
        System.out.println("VROOM");
        //this is called method overriding 
        /*the original method drive is coming from vehicle class. it was inherited 
        by car child class*/

    }

    public boolean canOilChange(){
        return true;
        //method overloading= methods with the same names but different parameters
    }

    public boolean canOilChange(String str){
        return false;
    }

    public int defaultWheels(){
        return 4;
    }
    //this calls constructor from parent class
    public Car (String make, String model, int year){
        super(make, model, year);
    }

    public String toString(){
        return make + model + year;

    }
}