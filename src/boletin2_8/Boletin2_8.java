
package boletin2_8;

/**
 *
 * @author David
 */
import java.util.Scanner;
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float b100, bi100=100, b20, bi20=20, b5, bi5=5, b1, bi1=1;
        Scanner sc=new Scanner (System.in);
        System.out.println("Billetes de 100€ :");
        b100=sc.nextFloat();
        System.out.println("Billetes de 20€ :");
        b20=sc.nextFloat();
        System.out.println("Billetes de 5€ :");
        b5=sc.nextFloat();
        System.out.println("Monedas de 1€ :");
        b1=sc.nextFloat();
        
        System.out.println("Total billetes : "+ ((b100*bi100)+(b20*bi20)+(b5*bi5)+(b1*bi1)));
 
    }
    
}
