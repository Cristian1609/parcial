
package co.edu.udes.Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class Punto4 {

    public static void main(String[] args) {

       

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita longitud fibonacci:"));

        int[] serieF = new int[numero];

        serieF[0] = 0;
        serieF[1] = 1;

        for (int i = 2; i < numero; i++) {

            serieF[i] = serieF[i - 1] + serieF[i - 2];

        }

        String mensaje = "La serie es: ";
        
        for (int i = 0; i < numero; i++) {
            mensaje += "     \n                      " + serieF[i];

        }
        JOptionPane.showMessageDialog(null, "\n" + mensaje);

    }

}
