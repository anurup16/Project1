import java.io.Serializable;
public class Printer <Type extends Serializable> {
    Type t;

    public Printer(Type t) {
        this.t = t;
    }

    public void show() {
        System.out.println(t);
    }
}
