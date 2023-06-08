public class Mustang extends Car implements CarStuff{
    Mustang(){
        super("Mustang","xxx");
    }
    @Override
    public void color() {
        System.out.println("Red");
    }

    @Override
    public void fuelType() {
        System.out.println("Petrol");
    }

    @Override
    public void noOfshifts() {
        System.out.println(8);
    }

    @Override
    public void TopSpeed() {
        System.out.println("350 km/hr");
    }
}
