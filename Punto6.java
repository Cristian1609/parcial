
package co.edu.udes.Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class Punto6 {

    public static void main(String[] args) {

        String oracion = JOptionPane.showInputDialog(null, "DIGITA UNA ORACION");
        
        String[] palabras = oracion.split("\\s+");
        
        int cantidadPalabras = palabras.length;
        

        JOptionPane.showMessageDialog(null, "N° PALABRAS " + cantidadPalabras);

    }

}
