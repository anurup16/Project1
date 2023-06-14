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
