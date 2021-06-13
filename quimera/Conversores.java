/**
 * Contiene los metodos necesarios para realizar las conversiones de ADN a ARN y de ARN  aproteina
 * @author Franz Pfeiffer
 * @date 05-31-2021
 */
public class Conversores{

    /**
     * convierte un string de ADN en uno de ARN al cambiar los caracteres T por U
     * @param string que contiene las bases, representadas por caracteres, de ADN
     * @return string convertido a ARN
     * parte de este metodo fue copiado de codigo profe Sivana StringBasic quitarVocales
     */
    public String convertirArn(String adn) {
        String arn = "";
        //Recorrer un string como un arreglo
        for (int index = 0; index < adn.length(); index++){
            //Obtengo el elemento que se encuentra en el indice
            char elemento = adn.charAt(index);
            //Analizamos si el char es una T para convertirlo en una U
            if (elemento == 'T')
                elemento = 'U';
            arn+= elemento;
        }
        return arn;
    }
}