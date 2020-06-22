import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public  class FileRead {
/*Java BufferedReader class is used to read the text from a character-based input stream.
 It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.
 BufferedReader reader = new BufferedReader (new FileReader("file.txt");
 */
    public static void main(String[] args) throws IOException {
        FileReader inputRead = new FileReader("Readme.txt");
        BufferedReader reader = new BufferedReader(inputRead);
        String line = null;
        while ((line = reader.readLine())!= null) {
            System.out.println(line);
        }
        reader.close();
    }
}