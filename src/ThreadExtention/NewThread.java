package ThreadExtention;

public class NewThread extends Thread{
    
    NewThread(){
        //create a new Thread
        super("Demontration Thread.");
        System.out.println("Sub Thread: " + this);
        start();
    }
    // Enter in second Thread
    public void run(){
         try{

            for(int i = 5; i > 0; i--){
                System.out.println("Sub Thread: " + i);
                Thread.sleep(500);
            }

         } catch(InterruptedException e){
            System.out.println("Interrupted Exception in Sub Thread! " + e);
         }
         
         System.out.println("Sub Thread was over!");
    }
}
