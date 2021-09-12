import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        FileInputStream fis = null;
        int b = 0;

        try { fis = new FileInputStream("D: /1.txt");
            try {
              while (fis.read() != -1) {

              }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}

