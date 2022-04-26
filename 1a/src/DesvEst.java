
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * @author luzme
 */
public class DesvEst {

    /**
     * Default constructor
     */
    public DesvEst() {
    }

    /**
     * @param media 
     * @param dataList 
     * @param n 
     * @return
     */
    public double getDesvEstd(double media, String[] dataList, double n) {
        // TODO implement here
        double suma=0;
        for (int x = 0; x < dataList.length; x++) {
			suma = (double) (suma + (pow((Double.parseDouble(dataList[x])- media),2)));
                }
        double d = (suma/(n-1));
        double des = sqrt(d);
        return des;
    }
}