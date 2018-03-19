package sortersTesterClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class IntegerSorting{

		//private static Sorter<Integer> sorter; 
		private static ArrayList<Sorter<Integer>> sortersList = new ArrayList<>(); 
		static Integer [] array = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		public static void main(String[] args) { 
			sortersList.add(new BubbleSortSorter<Integer>()); 
			sortersList.add(new SelectionSortSorter<Integer>()); 
			sortersList.add(new InsertionSortSorter<Integer>()); 
			//sortersList.add(new SelectionSortSorter<Integer>());
			
			test("Sorting Using IntegerComparator1", new IntegerComparator1()); 
			test("Sorting Using IntegerComparator2", new IntegerComparator2()); 
		}
		
		private static void test(String msg, Comparator<Integer> cmp) { 

			System.out.println("\n\n*******************************************************");
			System.out.println("*** " + msg + "  ***");
			System.out.println("*******************************************************");
			
			Integer[] original, arr; 
			// generate random arrays is size i and test...
			for (int i=1; i<=20; i += 5) { 
				original = array;
				showArray("\n ---Original array of size " + i + " to sort:", original); 
				
				for (int s=0; s<sortersList.size(); s++) {
					Sorter<Integer> sorter = sortersList.get(s); 
				    arr = original.clone(); 
				    sorter.sort(arr, cmp);
				    showArray(sorter.getName() + ": ", arr); 
				}
			}
		}

		private static void showArray(String msg, Integer[] a) {
			System.out.print(msg); 
			for (int i=0; i<a.length; i++) 
				System.out.print("\t" + a[i]); 
			System.out.println();
		}

		
	}

