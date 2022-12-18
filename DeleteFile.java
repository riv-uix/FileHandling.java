package inputoutput;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File Myobj = new File("test.txt");
        if (Myobj.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("File does not exist");
        }
    }
}
