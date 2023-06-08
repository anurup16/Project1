import java.util.Scanner;
 abstract class Item {
    private String title;

    public Item() {
        this.title = "";
    }

    public Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public abstract String getListing();
}



 class Book extends Item {
    private String author;
    private String ISBN;

    public Book() {
        super();
        this.author = "";
        this.ISBN = "";
    }

    public Book(String title, String author, String ISBN) {
        super(title);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }



    public String getListing() {
        return "Book Name - " + getTitle() + "\nAuthor: " + author + "\nISBN #: " + ISBN;
    }

    public String toString() {
        return "Book: " + getTitle();
    }
}


 class Periodical extends Item {
    private int issueNum;

    public Periodical() {
        super();
        this.issueNum = 0;
    }

    public Periodical(String title, int issueNum) {
        super(title);
        this.issueNum = issueNum;
    }

    public int getIssueNum() {
        return this.issueNum;
    }


    public String getListing() {
        return "Periodical Title: " + getTitle() + "\nIssue #: " + issueNum;
    }


    public String toString() {
        return "Periodical: " + getTitle();
    }
}

public class myCollection {
    public static void main(String[] args) {
        {
            Item[] items = new Item[5];
            Scanner sc=new Scanner(System.in);

            for(int i=0;i<5;i++){
                System.out.println("Please enter B for book and P for Periodical:");
                String input=sc.nextLine();
                if(input.equalsIgnoreCase("B")){
                    System.out.println("Please enter name of Book:");
                    String name=sc.nextLine();
                    System.out.println("Please enter name of Author:");
                    String au = sc.nextLine();
                    System.out.println("Please enter ISBN:");
                    String isbn = sc.nextLine();
                    items[i] = new Book(name,au,isbn);
                }
                else if(input.equalsIgnoreCase("P")){
                    System.out.println("Please enter name of Periodical:");
                    String name=sc.nextLine();
                    System.out.println("Please enter the issue:");
                    int issue = sc.nextInt();
                    sc.nextLine();
                    items[i]=new Periodical(name,issue);
                }
            }
            for (Item item : items) {
                System.out.println(item.getListing());
            }
        }
    }
}
