package sorterClasses;

public class CocktailSortSorter<E> extends AbstractSorter<E>{
	
	public CocktailSortSorter() {
		super("Cocktail Sort");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void auxSort() {
		// pre: 1 < i < arr.length
		boolean swapped = true;
		int i = 0;
		int j = arr.length-1;
		
		while(i< j && swapped) {
			swapped = false;
			
			for (int k = i; k<j;k++) {
				if(cmp.compare(arr[k], arr[k+1]) > 0) {
					swapArrayElements(k, k+1);
					swapped = true;
				}
			}
			j--;
			if(swapped) {
				swapped = false;
				for(int k = j; k>i;k--) {
					if(cmp.compare(arr[k], arr[k-1]) < 0) {
						swapArrayElements(k, k-1);
						swapped = true;
					}
				}
			}
			i++;
		}
	}

}
