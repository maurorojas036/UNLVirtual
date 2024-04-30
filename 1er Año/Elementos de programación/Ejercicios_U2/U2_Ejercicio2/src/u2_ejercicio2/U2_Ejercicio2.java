/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2_ejercicio2;

//agrego libreria de JOptionPane
import javax.swing.JOptionPane;
/**
 *
 * @author mauro
 */
public class U2_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom, ape;
        nom = JOptionPane.showInputDialog("Ingrese un nombre");
        ape = JOptionPane.showInputDialog("Ingrese un apellido");
        if (nom.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre");
        }
        
        if (ape.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Debe ingresar un apellido");
        }
        
        if (!nom.isEmpty() && !ape.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Bienvenido " + nom + " " + ape);
        }
    }
    
}
