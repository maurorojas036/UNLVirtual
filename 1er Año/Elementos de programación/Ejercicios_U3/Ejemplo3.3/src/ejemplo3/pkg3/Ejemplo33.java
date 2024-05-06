/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3.pkg3;

/**
 *
 * @author Mauro
 * Escriba un proyecto que genere dos n´ umeros reales (con decimales) entre 0 y 100, aleatoriamente y
 * devuelva el de mayor valor absoluto
 * El metodo max devuelve el mayor entre 2 valores. ”Math.max”
 * El metodo abs devuelve el valor absoluto de un numero. ”Math.abs”
 * La funci´on random() devuelve un numero al azar entre 0 y 1.
 */
import javax.swing.JOptionPane;
import java.lang.Math;
public class Ejemplo33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro dos variables del tipo double
        double x , y;
        
        //les asigno un valor aleatorio, la funcion random() genera un numero aleatorio de 0 a 1.
        x = Math.random()*100;
        y = Math.random()*100;
        
        //obtengo el valor generado mayor y muestro el valor absoluto.
        double valAbs = Math.max(Math.abs(x), Math.abs(y)); 
       
        //Muestro el resultado
        JOptionPane.showMessageDialog(null,"Valor 1: " +x +"\nValor 2: " + y + "\nValor mayor: " + valAbs);
        
    }
    
}
