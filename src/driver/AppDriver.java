package driver;

import java.io.File;

import shapes.Shape;
import utilities.Debug;
import utilities.FileReader;
import utilities.SortingAlgorithms;

/**
 * Class description: Main class used to create FileReader, SortingAlgorithms,
 * to sort a shape array
 * 
 * @author Marcel Gallardo (000827700), Lynn Park , Tyler Halvorsen
 *
 * 
 */
public class AppDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
	
	
		
		/* VARIABLES */ 
		
		String filePath;
		Debug debug;
		Shape shapeArray[];
		SortingAlgorithms algorithm;
		FileReader reader;
		File file; 

		
		/* ARGS */ 
		// args needed -F - file, B,S,I,M,Q -  sort , H,V,BA - what to compare by (height , baseArea , Volume)
		// EX -  of proper args -Fpolyfor1.txt -B -H

		if (args.length < 1) {
			throw new RuntimeException("Not Enough Arguments");

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'B') {

			//filePath = args[0].substring(2); - dosnt work for me on mac 
		
			// file path 
			filePath = args[0].substring(2);
			// filePath = "/Users/mfgperez/Documents/University Classes/CMPRG 251 - OOP/Assignment1_CPRG311/"+ args[0].substring(2);
	
			debug = new Debug(0); // debugger - set as level 1
			
			reader = new FileReader(filePath, debug); // reader passing file path and debugger 

			shapeArray = reader.populateShapeArray(); // populate array 

			algorithm = new SortingAlgorithms(shapeArray); // pass array into the sorting algorithm constructor 

			algorithm.bubbleSort(debug); // call bubble sort 

			/* Get shape arrays  height */ 
			for (Shape a : shapeArray) {
				System.out.println(a.getHeight() + " ");
			}
			System.out.println("-----------------------------");
			System.out.println("array size " + shapeArray.length);

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'S') {

			
			
			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - set as level 1
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray);

			algorithm.selectionSort(debug);

			for (Shape a : shapeArray) {
				System.out.println(a.getHeight() + " ");
			}
			System.out.println("-----------------------------");
			System.out.println("array size " + shapeArray.length);

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'I') {

			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - set as level 1
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray);

			algorithm.insertionSort(debug);

			for (Shape a : shapeArray) {
				System.out.println(a.getHeight() + " ");
			}
			System.out.println("-----------------------------");
			System.out.println("array size " + shapeArray.length);

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'M') {

			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - set as level 1
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray);

			algorithm.mergeSort(shapeArray, debug);

			for (Shape a : shapeArray) {
				System.out.println(a.getHeight() + " ");
			}
			System.out.println("-----------------------------");
			System.out.println("array size " + shapeArray.length);

		} else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'Q') {

			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - to set level
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray);

			algorithm.quickSort(debug);

			for (Shape a : shapeArray) {
				System.out.println(a.getHeight() + " ");
			}
			System.out.println("-----------------------------");
			System.out.println("array size " + shapeArray.length);
		}
		else if (args[0].charAt(1) == 'F' && args[1].charAt(1) == 'G') {

			filePath = args[0].substring(2);
			debug = new Debug(0); // debugger - to set level
			reader = new FileReader(filePath, debug);

			shapeArray = reader.populateShapeArray();

			algorithm = new SortingAlgorithms(shapeArray);

			 algorithm.gnomeSort(debug);

			for (Shape a : shapeArray) {
				System.out.println(a.getHeight() + " ");
			}
			System.out.println("-----------------------------");
			System.out.println("array size " + shapeArray.length);
		}
		

	
		
		/* TESTING WITHOUT ARGS  */ 
		
		// debug = new Debug(0); // debugger - set as level 1

		// String path = "/Users/mfgperez/Documents/University Classes/CMPRG 251 - OOP/Assignment1_311/res/shape_data/polyfor1.txt";

		// file reader object
		// reader = new FileReader(path, debug);

		/* Shape Array (unsorted) and initialized */
		 //shapeArray = reader.populateShapeArray();

		// print out populated array and all shape names in array
		 //for (Shape a : shapeArray) {
		 //System.out.println(a.getShapeName() + " ");
		// }

		/* SortingAlgorithms class constructor with a shape array */
		 //algorithm = new SortingAlgorithms(shapeArray);

		 /* Sorts  */
		// algorithm.bubbleSort(debug); 
		// algorithm.selectionSort(debug); 
		// algorithm.quickSort(debug); 
		// algorithm.insertionSort(debug); 
		// algorithm.mergeSort(shapeArray); 
		//  algorithm.gnomeSort(debug); - terrible takes to long 

		// System.out.println("Sorted array based on hieght");

		/* Display array (Sorted) */
		 /*
		 for (Shape a : shapeArray) {
		   System.out.println(a.getHeight() + " ");
		 }
		 System.out.println("-----------------------------");
		 System.out.println("array size " + shapeArray.length);
          
          
          */
		 
		 
		/* BASE AREA AND VOLUME TESTING */
		
		/* REFLECTION WOULD GO HEAR */
	}

}
