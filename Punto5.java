
package co.edu.udes.Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class Punto5 {

   
    public static void main(String[] args) {
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero:"));
        String triangulo = "";
        for (int i = 1; i <= dato; i++) {
            
            for (int j = 1; j <= i; j++) {
                triangulo += "*";
            }
            
            triangulo += "\n";
        }
        JOptionPane.showMessageDialog(null, triangulo);
    }

}
