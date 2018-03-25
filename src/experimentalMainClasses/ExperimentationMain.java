package experimentalMainClasses;

import java.io.FileNotFoundException;
import java.util.Scanner;

import sorterClasses.BubbleSortSorter;
import sorterClasses.HeapSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;
import experimentalClasses.ExperimentController;
import experimentalClasses.StrategiesTimeCollection;

//import strategiesClasses.BubbleSort;

/**
 * 
 * @author pedroirivera-vega
 *
 */
public class ExperimentationMain {

	private static int[] parms = {50, 1000, 50, 200};
	// min size, max size, size increment, number of trials per size/strategy
	
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Enter the parameters for the test: ");
		System.out.println("(initial size of dataset) (final size of dataset) (increment steps) (repetitions)");
		
		Scanner input = new Scanner(System.in);
		for(int i = 0;i<4;i++) {
			parms[i] = input.nextInt();
		}
		
		// Parm1: initial size
		// Parm2: final size to consider
		// Parm3: incremental steps (size)
		// Parm4: trials per size
		ExperimentController ec = new ExperimentController(parms[0], parms[1], parms[2], parms[3]); 
		
		/**/	
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new BubbleSortSorter<Integer>()));
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new SelectionSortSorter<Integer>()));
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new InsertionSortSorter<Integer>()));
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new HeapSortSorter<Integer>()));
		/**/

		ec.run();    // run the experiments on all the strategies added to the controller object (ec)
		
		// save the results for each strategy....
		try {
			ec.saveResults();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
