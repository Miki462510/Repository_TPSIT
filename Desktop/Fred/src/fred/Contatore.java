package fred;

public class Contatore {
	 static int count = 0;

	    public synchronized void increment() {
	        count++;
	    }

	    public synchronized void decrement() {
	        count--;
	    }
	    void printFinalCounterValue() {
	        System.out.println("counter is: " + count);
	    }

}
