/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test ;
import statico org.junit.Assert. * ;


/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
	public NumberHelperTest () {
	}
	
	@org . junit . Test
	public void testIsEven () {
	System . fuori . println ( " isEven " );
	NumberHelper esempio = nuovo NumberHelper ( 3 );
	booleano expResult = false ;
	risultato booleano = istanza . è anche();
	assertEquals (expResult, risultato);
	// TODO rivede il codice di test generato e rimuove la chiamata predefinita per non riuscire.
	}

	@org . junit . Test
	public void testIsOdd () {
	System . fuori . println ( " isOdd " );
	NumberHelper istanza = new NumberHelper ( 4 );
	booleano expResult = false ;
	risultato booleano = istanza . isOdd ();
	assertEquals (expResult, risultato);
	// TODO rivede il codice di test generato e rimuove la chiamata predefinita per non riuscire.
	}

	
	@org . junit . Test
	public void testSum () {
	System . fuori . println ( " somma " );
	int n = 2 ;
	NumberHelper esempio = nuovo NumberHelper ( 3 );
	int expResult = 5 ;
	int risultato = istanza . somma (n);
	assertEquals (expResult, risultato);
	// TODO rivede il codice di test generato e rimuove la chiamata predefinita per non riuscire.
	}


	@org . junit . Test
	public void testIsPrime () {

	System . fuori . println ( " isPrime " );
	NumberHelper esempio = nuovo NumberHelper ( 7 );
	booleano expResult = true ;
	risultato booleano = istanza . isPrime ();
	assertEquals (expResult, risultato);
	// TODO rivede il codice di test generato e rimuove la chiamata predefinita per non riuscire.
	}


	@org . junit . Test
	public void testIsDivisibleBy () {
	System . fuori . println ( " isDivisibleBy " );
	int n = 2 ;
	NumberHelper istanza = new NumberHelper ( 4 );
	booleano expResult = true ;
	risultato booleano = istanza . isDivisibleBy (n);
	assertEquals (expResult, risultato);
	// TODO rivede il codice di test generato e rimuove la chiamata predefinita per non riuscire.
	}

}
