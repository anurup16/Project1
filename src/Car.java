public abstract class Car {
    String name;
    String model;
    Car(String name,String model){
        this.name=name;
        this.model=model;
    }
    public abstract void noOfshifts();
    public abstract void color();
    public abstract void fuelType();
}
