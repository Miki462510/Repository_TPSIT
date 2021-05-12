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
public class Mensa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
       Bancone ban = new Bancone();
       int numDipe=12;
        Cuoco cuo = new Cuoco(ban, numDipe);
        cuo.start();
        
        for(int i=0; i<numDipe; i++){
           Dipendenti d= new Dipendenti(ban);
           d.start();
        }
         for(int i=0; i<numDipe; i++){
            Dipendenti d= new Dipendenti(ban);
            d.join();
        }
         cuo.join();
        System.out.println("Fine pausa pranzo");

    }
    
}
