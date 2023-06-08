import java.util.*;
class Customer {
    String name;
    String accNO;

    Customer(String name, String accNO) {
        this.name = name;
        this.accNO = accNO;
    }
}
class BankAccount{
    static double balance;
    BankAccount(){

    }
    BankAccount(double b){
        balance=b;
    }
    public void balanceLeft(double d){
        System.out.println("Remaining balance:"+(balance-d));
    }
    public void balanceInquiry(){
        System.out.println(balance);
    }
}
public class ATM {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose: 1 for cash withdraw, 2 for Balance Inquiry");
        int choice = input.nextInt();
        Customer c = new Customer("Anurup Dey", "22BEE1271");
        BankAccount b = new BankAccount(5000000);
        if (choice == 1) {
            System.out.println("Customer name:" + c.name);
            System.out.println("Account Number:" + c.accNO);
            System.out.println("Your Balance:" + b.balance);
            System.out.println("Now enter the amount you want to withdraw:");
            double amount = input.nextDouble();
            b.balanceLeft(amount);
        } else if (choice == 2) {
            System.out.println("Customer name:" + c.name);
            System.out.println("Account Number:" + c.accNO);
            System.out.println("Your Balance:" + b.balance);
            b.balanceInquiry();
        } else
            System.out.println("Thank You");
    }
}

