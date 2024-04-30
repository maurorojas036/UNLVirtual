/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2_ejercicio3;
//Importa la biblioteca JOptionPane
import javax.swing.JOptionPane;
        
/**
 *
 * @author rojas mauro
 */
public class U2_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo dos propiedad del tipo string nombre(nom) y apellido(ape)
        String nom,ape;
        
        //Mediando JOptionPane asigno a cada variable el valor ingresado en el label de nombre y apellido
        nom = JOptionPane.showInputDialog("Ingrese un nombre");
        ape = JOptionPane.showInputDialog("Ingrese un apellido");
        
        //mediante una ventada doy la Bienvenida al usuario que ingreso nombre y apellido.
        JOptionPane.showMessageDialog(null, "Bienvenido " + ape +" "+nom);
    }
    
}
