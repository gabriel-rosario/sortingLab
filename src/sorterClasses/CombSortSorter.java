package sorterClasses;

public class CombSortSorter<E> extends AbstractSorter<E>{
	
	public CombSortSorter() {
		super("Comb Sort");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void auxSort() {
		 int gap = arr.length;
	     double shrinkFactor = 1.3;
	     boolean swapped = false;

	        while (gap > 1 || swapped) {
	            if (gap > 1) {
	                gap = (int)(gap / shrinkFactor);
	            }

	            swapped = false;

	            for (int i = 0; gap + i < arr.length; i++) {
	                if (cmp.compare(arr[i], arr[i+gap])>0) {
	                    swapArrayElements(i, i+gap);
	                    swapped = true;
	                }
	            }
	        }
	    }
	}
