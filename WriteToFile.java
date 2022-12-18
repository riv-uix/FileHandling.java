package inputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter Myobj = new FileWriter("test.txt");
            Myobj.write("This is a test file");
            Myobj.close();
            System.out.println("File created");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}