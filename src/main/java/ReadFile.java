import com.sun.javaws.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {
    public static void main (String args[]) throws IOException {
        InputStream inputReader = Main.class.getResourceAsStream("/test.txt");
        InputStreamReader streamReader = new InputStreamReader(inputReader);
        BufferedReader reader = new BufferedReader(streamReader);
        String line = null;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}
