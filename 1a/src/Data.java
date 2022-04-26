/**
 * @author luzme
 */
public class Data {

    /**
     * Default constructor
     */
    public Data() {
    }

    /**
     * @param data 
     * @return
     */
    public String[] saveData(String data) {
        // TODO - implement Data.saveData
        String[] arrData = data.split(",");
        return arrData;
    }
}