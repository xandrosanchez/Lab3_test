package FileWorker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileWorker {

    public String getResult() {
        String result;
        try (FileReader reader = new FileReader("result.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256){
                    buf = Arrays.copyOf(buf,c);
                }

            }
            result = String.valueOf(buf);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public void setResult(String result){
        try (FileWriter writer = new FileWriter("result.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
