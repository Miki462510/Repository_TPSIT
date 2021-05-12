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
public class Dipendenti extends Thread{
    int numOrdine;
    Bancone b;
    int max=12;
    int indi;
    int numDipe=0;
    
    public Dipendenti(Bancone ban){
        this.b= ban;
    }
    
    @Override
    public void run(){
        try{
            sleep((int) (Math.random()*500));
        }catch(InterruptedException es){
            
        }
        numOrdine=(int) (Math.random()*5)+1;
        b.depositaPiatto(numOrdine);
    }
}
