import java.util.List;
public class App {
    public static void main(String[] args){
        var list=List.of("anurup","ujjayini").stream().map(String::toUpperCase).toList();
        System.out.println(list);
    }
}
