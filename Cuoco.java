/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensa;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author informatica
 */
public class Cuoco extends Thread{
    private int numOrdine;
    Bancone b;
    int numDipe;
    
    public Cuoco(Bancone b, int numDipe){
        this.b=b;
        this.numDipe=numDipe;
    }
    public void run(){
        while(numDipe>0){
            numOrdine= b.prelevaPiatto();
            try{
                sleep((int) (Math.random()*500));
            }catch (InterruptedException ex){
                
            }
             numDipe--;
        }
        
    }
}
