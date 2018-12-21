
package jabva5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Multithreading extends Thread
{
    private String currentThread;
     synchronized  public void run()
    {
        try{
           
        Thread.sleep(500);
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread"+this.currentThread+"="+i);
            
    }
    
}       catch (InterruptedException ex) {
            Logger.getLogger(Multithreading.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}




public class Jabva5 {

   
    public static void main(String[] args) {
            Multithreading t1=new Multithreading();
         Multithreading t2=new Multithreading();
           t1.setPriority(1);
         t2.setPriority(10);
         t1.start();
         t2.start();
        
        
    }
    
}
