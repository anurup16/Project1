public class Test {
    public static void main(String[] args){
        Printer<Character> obj=new Printer<>('c');
        obj.show();
        show(54);
        show("whatever");
    }
    public static <Type> void show(Type t){
        System.out.println(t);
    }
}
