/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Dayat
 */
public class TugasSD implements Runnable{
    private int td;
    
    public TugasSD(int id){
        this.td=id;
    }
 @Override
    public void run() {
  
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      System.out.println("Menghitung Bilangan Ganjil = "+td);
      
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
    }
}  
    
