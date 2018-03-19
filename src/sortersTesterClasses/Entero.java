package sortersTesterClasses;

public class Entero implements Comparable{
	private int value; 
    public Entero(int v) { value = v; }
    public int getValue() { return value; } 
    public String toString() { return value + ""; }
    
    
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

  
}
