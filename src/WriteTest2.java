import java.util.Scanner;

 abstract class TestQuestion {
    protected String question;

    protected abstract void readQuestion();

    public String toString() {
        return question;
    }
}

 class Essay1 extends TestQuestion {
    private int numBlankLines;

    protected void readQuestion() {
        Scanner in = new Scanner(System.in);
        numBlankLines = in.nextInt();
        in.nextLine(); // consume the newline character after the integer
        question = in.nextLine();
    }

    public String toString() {
        return question + "\n" + "\n".repeat(numBlankLines);
    }
}

 class MultChoice1 extends TestQuestion {
    private String[] choices;

    protected void readQuestion() {
        Scanner in = new Scanner(System.in);
        int numChoices = in.nextInt();
        in.nextLine(); // consume the newline character after the integer
        choices = new String[numChoices];
        for (int i = 0; i < numChoices; i++) {
            choices[i] = in.nextLine();
        }
        question = in.nextLine();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(question).append("\n");
        for (int i = 0; i < choices.length; i++) {
            sb.append((char) ('a' + i)).append(") ").append(choices[i]).append("\n");
        }
        return sb.toString();
    }
}

public class WriteTest2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numQuestions = in.nextInt();
        TestQuestion[] questions = new TestQuestion[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            char questionType = in.next().charAt(0);
            if (questionType == 'e') {
                questions[i] = new Essay1();
            } else if (questionType == 'm') {
                questions[i] = new MultChoice1();
            }
            questions[i].readQuestion();
        }

        for (int i = 0; i < numQuestions; i++) {
            System.out.printf("%d. %s\n", i + 1, questions[i]);
        }
    }
}
