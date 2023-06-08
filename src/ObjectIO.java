import java.io.*;
import java.util.*;
public class ObjectIO{
    public static void main(String[] args)throws Exception{
        //serialization
        File myfile=new File("Student.txt");
        ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream(myfile));
        System.out.println("Enter Student name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter registration number:");
        String reg=sc.nextLine();
        Student sobj=new Student(name,reg);
        objout.writeObject(sobj);
        objout.close();
        //deserialization
        ObjectInputStream objin=new ObjectInputStream(new FileInputStream(myfile));
        Student sobj2=(Student)objin.readObject();
        System.out.println(sobj2.name+sobj2.regID);
        objin.close();
        sc.close();
    }

}
class Student implements Serializable{
    String name,regID;
    Student(String name,String regID){
        this.name=name;
        this.regID=regID;
    }
}