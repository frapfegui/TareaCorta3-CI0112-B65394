
/**
 * Ejemplos de main permutaciones
 * se encarga de correr el programa
 * @author Franz Pfeiffer
 * @date 06-12-2021
 */
public class PermutacionesMain {
    public static void main(String [] args){
        PermutarString ps = new PermutarString ();
        boolean permutacion = (ps.compararStrings("bad", "dab"));
        if (permutacion)
            System.out.println("True");
        else
        System.out.println("False");
    }

}