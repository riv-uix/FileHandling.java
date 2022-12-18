package inputoutput;


import java.io.File;
import java.io.IOException;


//Rival Wahyudi
public class CreateFile {
    public static void main(String[] args) {
        try {
             File Myobj = new File("test.txt");
            if (Myobj.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
