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

    /**
     * convierte un string de ARN en uno de proteina
     * @param string que contiene el String de ARN
     * @return no retorna nada imprimi directamenta letra por letra los grupos de 3 de ARN en proteinas
     * parte de este metodo fue copiado de codigo profe Sivana StringBasic quitarVocales
     */
    public void convertirProteina(String arn) {
        //Divido cada string en grupos de 3 partes
        arn = agregarGuiones(arn);
        System.out.println(arn);
        String[] parts = arn.split("-");
        //obtengo las primeras dos letras de cada String del arreglo parts y recooro cada string como un arreglo
        for (int index = 0; index < 8; index++){
            //Obtengo el elemento que se encuentra en el indice
            char primerElemento = parts[index].charAt(0);
            char segundoElemento = parts[index].charAt(1);
            //tomando la primera y segunda letra de las partes ya puedo saber a que letra de la proteina corresponde
            char letraProteina = analizarLetras(primerElemento, segundoElemento);
            //imprimo una por una cada letra conseguida con el metodo analizarLetras
            System.out.print(letraProteina);
        }
    }

    public String agregarGuiones(String arn) {
        String arnGuiones = "";
        int contador = 1;
        //Recorrer un string como un arreglo
        for (int index = 0; index < arn.length(); index++){
            //Obtengo el elemento que se encuentra en el indice
            char elemento = arn.charAt(index);
            arnGuiones+= elemento;
            //si estamos en un indice multiplo de 3 se agrega un guion despues de haber agregado el elemento correspondiente a ese indice
            if (contador == 3){
                arnGuiones+= '-';
                contador = 0;;
            }
            contador ++;
            
        }
        return arnGuiones;
    }

    public char analizarLetras(char primero, char segundo) {
        char letra = ' ';
        if (primero == 'G' && segundo == 'U')
        letra = 'V';
        if (primero == 'C' && segundo == 'A')
        letra = 'H';
        if (primero == 'C' && segundo == 'U')
        letra = 'L';
        if (primero == 'A' && segundo == 'C')
        letra = 'T';
        if (primero == 'C' && segundo == 'C')
        letra = 'P';
        if (primero == 'G' && segundo == 'A')
        letra = 'E';
        if (primero == 'A' && segundo == 'A')
        letra = 'K';
        return letra;
    }
}