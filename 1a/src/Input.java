
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * @author luzme
 */
public class Input {

    /**
     * Default constructor
     */
    public Input() {
    }

    /**
     * 
     */
    private String data;

    /**
     * 
     */
    private BufferedReader br = null;

    /**
     * @param inFile 
     * @return
     */
    public String readData(String inFile) { //Funcion Data
        System.out.println("Cargando...");
		try 
			{
				br = new BufferedReader(new FileReader(inFile));
				StringBuilder sb = new StringBuilder();
				String line;
				while ( (line = br.readLine()) != null ) 
					{
						sb.append(line);
                        sb.append(",");
                        System.out.println("line ..." + line);
					}
				data = sb.toString();
			} 
		catch (IOException e) 
			{
                System.out.println("error : " + e);
				e.printStackTrace();
			}
	return data;
    }
}