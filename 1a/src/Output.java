
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author luzme
 */
public class Output {

    /**
     * Default constructor
     */
    public Output() {
    }

    /**
     * @param outFile 
     * @param outText
     */
    public void writeData(String outFile, String outText) {
        // TODO implement here
         BufferedWriter output = null;
        try 
            {
                File file = new File(outFile);
                output = new BufferedWriter(new FileWriter(file));
                output.write(outText);
                output.close();
            }
        catch ( IOException e ) 
            {
                e.printStackTrace();
            }
    }
}