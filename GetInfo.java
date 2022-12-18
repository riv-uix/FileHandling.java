package inputoutput;

import java.io.File;

public class GetInfo {
    public static void main(String[] args) {
        File Myobj = new File("test.txt");
        if (Myobj.exists()) {
            System.out.println("File name: " + Myobj.getName());
            System.out.println("Absolute path: " + Myobj.getAbsolutePath());
            System.out.println("Writeable: " + Myobj.canWrite());
            System.out.println("Readable: " + Myobj.canRead());
            System.out.println("File size in bytes: " + Myobj.length());
        } else {
            System.out.println("File does not exist");
        }
    }
    
}
