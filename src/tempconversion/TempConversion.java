/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversion;

/**
 *
 * @author Ray Mullins
 */
   import java.util.Scanner;
public class TempConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        double celsiusTemp, fahrenheitTemp;
        //set up input from keyboard
        Scanner keyboard=new Scanner(System.in);
        //prompt user for temp in celcius
        System.out.print("Enter Temperature in Celcius: ");
        celsiusTemp = keyboard.nextDouble();
        //convert to fahrenhiet
        fahrenheitTemp = (9.0/5.0)*celsiusTemp + 32;
        //print to screen conversion
        System.out.println("\n"+celsiusTemp+" degrees Celsius is " + fahrenheitTemp + " degrees Fahrenheit.");
    }
    
}
