
/**
 * @author luzme
 */
public class Logic {

    /**
     * Default constructor
     */
    public Logic() {
    }

    /**
     * 
     */
    private int n;

    /**
     * 
     */
    private String data;

    /**
     * 
     */
    private String[] arrData;

    /**
     * 
     */
    private double media;

    /**
     * 
     */
    private double desv;

    /**
     * @return
     */
    public void logic1a() {
        // TODO implement here
        Input myInput = new Input();
        Output myOut = new Output();
        
		Data myData = new Data();
		Media myMedia = new Media();
		DesvEst myDesv = new DesvEst();

        data = myInput.readData("C:\\Users\\Luciernaga\\Documents\\aspectos_hum2022\\Proyect 1a\\code\\1a\\1a.txt");
        System.out.println("data :  " + data);

		arrData = myData.saveData(data);
        n = arrData.length;
        System.out.println("n :  " + n);

        media = myMedia.getMedia(arrData, n);
        System.out.println("media :  " + media);

	desv = myDesv.getDesvEstd(media, arrData, n);
        System.out.println("desv std :  " + desv);
        
        myOut.writeData("out1.txt", "Media = " + media + " Desv. = " + desv);
    }
}