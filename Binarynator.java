/*This is a git try
 * The Binarynator translate the entered number to binary
 * I wrote at the beginniing of my java studies.
 * months JavaStudiesTime = 2;
 */
package binarynator;

import static binarynator.BinCalc.BinCalc;
import java.util.Scanner;

/**
 *hogy is van ez?
 * @author Bodnart
 */
public class Binarynator{
    public static void main(String[] args) {
            //Call the calculator method from BinCalc Class
            BinCalc();
    }       //in this method the user chooses the next step 
            public static void choose(){
            
            Scanner sc = new Scanner(System.in);
                System.out.println("Again?");
                System.out.println("Yes 1.)");
                System.out.println("No 2.)");
                int v = sc.nextInt();
               switch (v){
                   //calculate again
                   case 1: 
                       BinCalc();
                       break;
                   //exit from program    
                   case 2:
                       System.out.println("Bye!");
                       
                       System.exit(0);
                   //Imput a correct answer    
                   default:
                       System.out.println("Wrong input, try again!");
                       choose();
                       break;
               }
        }
}
