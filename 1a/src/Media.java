
/**
 * @author luzme
 */
public class Media {

    /**
     * Default constructor
     */
    public Media() {
    }

    /**
     * 
     */
    private double media;
    /**
     * @param dataList 
     * @param n 
     * @return
     */
    public double getMedia(String[] dataList, int n) {
        // TODO implement here
        double suma = 0;
        for(int i=0;i<dataList.length;i++)
        {
            System.out.println(dataList[i]);
        }
		for (int x = 0; x < dataList.length; x++) {
			suma = suma + Double.parseDouble(dataList[x]);
                }
                double promedio = suma / dataList.length;
        return promedio;
    }
}