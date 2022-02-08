package Runnable;

public class NewThread  implements Runnable{
    // create a new Thread
    Thread t;

    NewThread(){
        // Create a new Thread
        t = new Thread(this, "Demonstration Thread!");
        System.out.println("Sub Thread create:  "  +  t);
        t.start();
    }
    // Enter in New Thread
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Sub Thread: " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Sub Thread was Interrupted.");
        }
        System.out.println("Sub Thread was over!");
    }
}
