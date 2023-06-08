import java.io.*;
import java.util.Scanner;

abstract class TestQuestions {
    protected String question;
    protected abstract void readQuestions();
    public String toString(){
        return question;
    }
}
class Essay extends TestQuestions{
    protected int numLines;

    public void readQuestions(){
        Scanner input=new Scanner(System.in);
        numLines=input.nextInt();
        input.nextLine();
        question=input.nextLine();
    }
    public String toString(){
        return question+"\n"+"\n".repeat(numLines);
    }
}
class MultChoice extends TestQuestions{
    private String[] options;
    public void readQuestions(){
        Scanner input=new Scanner(System.in);
        int numChoice=input.nextInt();
        input.nextLine();
        question=input.nextLine();
        options=new String[numChoice];
        for (int i=0;i<numChoice;i++){
            options[i]=input.nextLine();
        }

    }
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append(question).append("\n");
        for (int i = 0; i < options.length; i++) {
            s.append((char)('a'+i)).append("> ").append(options[i]).append("\n");
        }
        return s.toString();
    }
}
public class WriteTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        TestQuestions[] questions=new TestQuestions[num];
        for (int i = 0; i < num; i++) {
            char choice = input.next().charAt(0);
            if (choice == 'e') {
                questions[i] = new Essay();
                questions[i].readQuestions();
            }
            else if (choice == 'm') {
                questions[i] = new MultChoice();
                questions[i].readQuestions();
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println((i + 1)+". "+questions[i]);
        }
    }
}