import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args)throws IOException {
        String fileName = "example.txt";

        // Create the file
        File file = new File(fileName);

        try {
            // Write content to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Hello, World!\n");
            writer.write("This is an example file.\n");
            writer.write("Java File I/O operations.\n");
            writer.close();

            // Read and print the contents of the file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            System.out.println("Contents of the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing/reading the file.");
            e.printStackTrace();
        }
    }
}
