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
public class App {
     public static void main(String[] args){
        //method newFixedTreadPool digunakan untuk menentukan ukuran tetap thread yang bekerja
        ExecutorService service = Executors.newFixedThreadPool(5);
        
        for (int i=1; i<=100; i++){
            if(i%2==1)
            service.submit(new TugasSD(i));
            
        }
        //mematikan semua service setelah semua task tersubmit
        service.shutdown();

        try{
            service.awaitTermination(1, TimeUnit.DAYS);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("================================");
         System.out.println("SUSKSES MENGHITUNG 1-100");
         System.out.println("Imam Hidayat");
         System.out.println("5160311105");
    }
    
}
