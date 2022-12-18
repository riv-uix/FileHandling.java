package inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File Myobj = new File("test.txt");
            Scanner MyReader = new Scanner(Myobj);
            while (MyReader.hasNextLine()) {
                String data = MyReader.nextLine();
                System.out.println(data);
            }
            MyReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}