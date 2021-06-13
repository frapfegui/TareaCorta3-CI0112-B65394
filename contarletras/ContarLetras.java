import java.lang.System;

public class ContarLetras {
    /**
     * imprime una por una cada letra del abecedario y cuantas veces aparece en la oracion
     * @param string la oracion a la que vamos a contar las letras
     * @return no retorna nada
     * parte de este metodo fue copiado de codigo profe Sivana StringBasic quitarVocales
     * metodo para conseguir array con el abecedario, copiado de http://www.forosdelweb.com/f45/abecedario-java-227470/
     */

    public void contarLetras(String oracion){
        char[] s;
        s=new char[26];
        for (int i=0; i<26; i++) {
            s[i] = (char) ('A' + i );
            int resultado = 0;
            char character = s[i];
            //Recorrer un string como un arreglo
            for (int index = 0; index < oracion.length(); index++){
                //Obtengo el elemento que se encuentra en el indice
                char elemento = oracion.charAt(index);
                //Pasar el char a mayuscula para comparar con el char
                char elementoMayuscula = Character.toUpperCase(elemento);
                //Revisamos si el elemento en Mayuscula es igual al char
                if (elementoMayuscula == character)
                    //Agregar el char al string sin vocales
                    resultado++;
            }
            System.out.print(character);
            System.out.println(" = " + resultado);
        }
    }
}
