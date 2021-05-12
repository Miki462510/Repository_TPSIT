/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensa;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author informatica
 */
public class Bancone {
    Semaphore V = new Semaphore(1);
    Semaphore P = new Semaphore(0);
    int numOrdine;

    public void depositaPiatto (int numOrine){
        try{
            V.acquire();
        }catch (InterruptedException ex){
            
        }
        this.numOrdine++;
        System.out.println("Piatto N°:" + this.numOrdine + "pronto");
        P.release();
    }
    
    public int prelevaPiatto(){
        try{
            P.acquire();
        }catch (InterruptedException ex){
            
        }
        System.out.println("Piatto " + this.numOrdine + "consumato");
        V.release();
        return this.numOrdine;
    }
}
