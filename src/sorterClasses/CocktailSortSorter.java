package sorterClasses;

public class CocktailSortSorter extends AbstractMaxValueSorter{
	
	public CocktailSortSorter() {
		super("		Cocktail Sort");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
		// pre: 1 < i < arr.length
		for (int j=0; j < i-1; j++) 
			if (cmp.compare(arr[j], arr[j+1]) > 0)
				super.swapArrayElements(j, j+1);
		
	}


	

}
