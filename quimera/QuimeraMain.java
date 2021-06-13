/**
 * 
 * se encarga de correr el programa
 * @author Franz Pfeiffer
 * @date 06-12-2021
 */
public class QuimeraMain {
    public static void main(String[] args) {
        Conversores cv = new Conversores();
        String hileraArn = cv.convertirArn("GTGCATCTGACTCCTGAGGAGAAG");
        System.out.println(hileraArn);
        //String hileraProteina = cv.convertirProteina(hileraArn);
        //System.out.println(hileraProteina);
    }

}
