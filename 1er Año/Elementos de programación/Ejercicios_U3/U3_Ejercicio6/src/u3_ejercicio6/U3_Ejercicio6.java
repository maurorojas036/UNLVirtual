/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3_ejercicio6;
import javax.swing.JOptionPane;

/**
 *Proponga un proyecto Java que calcule las raices o soluciones de una ecuacion cuadratica del tipo ax2+
 *bx + c = 0, siendo que el usuario del programa ingresa como datos los coeficientes a, b y c. Suponga
 *que los datos corresponden a ecuaciones de raices reales.
 *Declare las variables necesarias y dise˜ne una interfaz de usuario adecuada.
 * @author Mauro
 */
public class U3_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables.
        double a,b,c;
        
        //Solicito el ingreso de los coeficientes a,b,c
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el coeficiente a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el coeficiente b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el coeficiente c"));
        
        //Realizo el calculo de las raices.
        // (-b +- sqrt( pow(b,2) - 4*a*c))/ 2*a
        Double sqrt = Math.sqrt( Math.pow(b, 2) - 4*a*c);
        if(!sqrt.isNaN()){
           double resultado_1 = (-b + Math.sqrt( Math.pow(b, 2) - 4*a*c)) / 2*a;
        
            double resultado_2 = (-b - Math.sqrt( Math.pow(b, 2) - 4*a*c)) / 2*a;
        
            //Muestro el mensaje informando las raices.
            JOptionPane.showMessageDialog(null, "Las valores de las raices son: \nResultado 1: " + resultado_1 + "\nResultado 2: " + resultado_2);
        }else{
            JOptionPane.showMessageDialog(null, "No se puede obtener la raiz de un valor negativo.");
        }
        
    }
    
}
