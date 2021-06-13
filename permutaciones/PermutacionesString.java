/**
 * Contiene los metodos necesarios para permutar y comparar dos Strings
 * @author Franz Pfeiffer
 * @date 05-31-2021
 */
public class PermutacionesString {

    /**
     * Compara si un string es la permutacion de otro
     * @param string primero y segundo = las palabras a comparar
     * @return boolean si es verdadero que es la permutacion o no
     */
    public boolean compararStrings(String primero, String segundo) {
        String resultado = revetirHilera(primero);
        if (resultado.equals(segundo))
            return true;
        else {
            return false;
        }
    }

    /**
     * Revierte un texto
     * @param string El texto a revertir
     * @return El texto revertido
     * Copiado de codigo profe Sivana StringBasic
     */
    public String revetirHilera(String string) {
        String hileraInvertida = "";
        for (int index = 0; index < string.length(); index++) {
            hileraInvertida = string.charAt(index) + hileraInvertida;
        }
        return hileraInvertida;
    }
}