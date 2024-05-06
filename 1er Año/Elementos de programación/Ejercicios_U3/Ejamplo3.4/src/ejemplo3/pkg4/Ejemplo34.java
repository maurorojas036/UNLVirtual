/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3.pkg4;

/**
 *
 * @author Mauro
 * Calcular el area de un cırculo ingresando el radio por teclado.
 * Area = PI * (radio)2
 */
import javax.swing.JOptionPane;
import java.lang.Math;

public class Ejemplo34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro el radio sin asignar ningun valor y Area.
        double radio, area;
        //Inicializo con un valor ingresado por teclado
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
        
        area = Math.PI * Math.pow(radio,2);
        //Calculo el Area
        
        //Muestro el resultado. 
        JOptionPane.showMessageDialog(null,"El valor del area es: " + area);
    }
    
}
