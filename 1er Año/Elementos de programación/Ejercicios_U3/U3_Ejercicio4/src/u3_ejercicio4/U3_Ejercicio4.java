/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3_ejercicio4;
import javax.swing.JOptionPane;
/**
 *
 * @author mauro
 * Escriba un proyecto Java que permita ingresar una temperatura en grados Fahrenheit y obtenga el correspondiente valor 
 * en grados Celsius. Utilice la expresiones de la figura 1. Documente convenientemente la salida y declare las variables 
 * que crea necesarias. Defina el 32 como constante con nombre.
 */

public class U3_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double temperaturaFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un temperatura en grados Fahrenheit"));
        final int t_constante = 32;
        double tCelcius;
        
        //Una vez que obtengo la temperatura ingresada por teclado la paso a celcuis mediante la formula.
        tCelcius = (temperaturaFahrenheit - t_constante )* ((double)5/9);
        
        //muestro la temperatura en Celcius
        //De esta manera redondeo para mostrar un numero flotante con solo dos decimales
        JOptionPane.showMessageDialog(null, "La temperatura es: " + (Math.round(tCelcius * 100d) / 100d)  +" C°");
    }
    
}
