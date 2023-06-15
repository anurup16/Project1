import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentTest[] details = new StudentTest[3];

        for (int i = 0; i < details.length; i++) {
            details[i] = new StudentTest();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            details[i].setname(sc.nextLine());

            System.out.println("Enter registration number of student " + (i + 1) + ":");
            details[i].setregno(sc.nextLine());

            System.out.println("Enter address of student " + (i + 1) + ":");
            details[i].setaddress(sc.nextLine());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(details[i].getname());
            System.out.println(details[i].getregno());
            System.out.println(details[i].getaddress());
        }
        sortStudents(details);
    }
    public static void sortStudents(StudentTest[] s){
        StudentTest temp=new StudentTest();
        for(int i=0;i<s.length-1;i++){
            for(int j=0;j<s.length-1-i;j++){
                if(s[j].getname().compareTo(s[j+1].getname())>0){
                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        for(StudentTest t: s){
            System.out.println(t.getname());
            System.out.println(t.getregno());
            System.out.println(t.getaddress());
        }
    }
}

 class StudentTest {
    private String name, regno, address;

    public StudentTest() {

    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setregno(String regno) {
        this.regno = regno;
    }

    public String getregno() {
        return regno;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return address;
    }
}
