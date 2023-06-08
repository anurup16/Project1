abstract class Animal{
  int age;
  String name;
  public abstract void makeNoise();
  public abstract void eat();
}
public  class Random extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("BRRRRRR");
    }
    public void eat(){
        System.out.println("Biriyani");
    }
}

