import java.io.*;
import java.util.*;
public class ObjectArrayIO {
    public static void main(String[] args)throws Exception,EOFException{
       //serialization of array of objects
        Scanner sc=new Scanner(System.in);
        Student1[] s=new Student1[2];
        File myfile=new File("studentregister.txt");
        ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream(myfile));
        System.out.println("Enter Student Details:");
        String name,reg,address;
        for(int i=0;i<s.length;i++){
            System.out.println("Enter name:");
            name= sc.nextLine();
            System.out.println("Enter registration ID:");
            reg=sc.nextLine();
            System.out.println("Enter address:");
            address=sc.nextLine();
            s[i]=new Student1(name,reg,address);
            objout.writeObject(s[i]);
        }
        objout.writeObject(new Student1());
        objout.close();
        //deserialization of array of objects
        ObjectInputStream objin=new ObjectInputStream(new FileInputStream(myfile));
        Object obj=null;
        while(!((obj=objin.readObject())instanceof EndofFile)){
            System.out.println(((Student1)obj).name+((Student1)obj).regID+((Student1)obj).address);
        }
        objin.close();
    }
}
class Student1 implements Serializable{
    String name,regID,address;
    Student1(String name,String regID,String address){
        this.name=name;
        this.regID=regID;
        this.address=address;
    }
    Student1(){

    }
}
class EndofFile implements Serializable{}

