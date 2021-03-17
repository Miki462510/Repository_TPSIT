package fred;

public class Contatore {
	 static int count = 0;

	    public void increment() {
	        count++;
	    }

	    public void decrement() {
	        count--;
	    }
	    void printFinalCounterValue() {
	        System.out.println("counter is: " + count);
	    }

}
