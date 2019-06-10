/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10.pkg06.pkg2019;

import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author TIMO
 */
public class Practica10062019 {

     // lee registro del archivo
    public static void leerRegistros() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/tabula.csv"));
            double suma1 = 0;
            double suma2 = 0;
            int i = 0;
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                // Se elije el dato que se quiere en el arreglo
                double height = Double.parseDouble(linea_partes.get(9));
                suma1 = suma1 + height;
                double goals = Double.parseDouble(linea_partes.get(11));
                suma2 = suma2 + goals;
                // Se agrega en 1 el contador para obtener el promedio
                i++;
            } // fin de while
            // Se cierra la entrada
            entrada.close();
            // Se calcula el promedio de altura
            double promedioA = suma1 / i;
            // Se imprime el promedio de altura
            System.out.printf("El promedio de altura es:  %2f\n", promedioA);
            // Se calcula el promedio de goles
            double promedioGoles = suma2 / i;
            // Se imprime el promedio de goles
            System.out.printf("El promedio de goles es:  %2f", promedioGoles);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
} // fin de la clase LeerArchivoTexto
