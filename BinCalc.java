/*
 *This Class calculate the binary number from decimal
 */
package binarynator;

import static binarynator.Binarynator.choose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bodnart
 */
public class BinCalc {
    public static void BinCalc(){
                Scanner Sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = Sc.nextInt();

		int o = n/2; // 'n' divided by two
		int m = n%2; // remainder of division

		// create a List 
		List<Integer> bin = new ArrayList<>();
		// add to list the remainder of the firs division
		bin.add(m);
		/* create a loop, while the 'o' bigger than one
		 * divided by two, and the remainder
		 * add to the List
		 */
		while ( o > 1 ){
			m = o % 2;
			o = o / 2;
			bin.add(m);
		} 
		// when the 'o' is one, add to the List
		bin.add(o);
		// reverse the List to the correct order
		Collections.reverse(bin);
		// transform to String
		String b = bin.toString();
                // Delete from the String the unnecessary characters, like '[], '
		String bf = b.replaceAll("[^0-9]", "");
		System.out.println(bf);
                
                choose();
        }
}