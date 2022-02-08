package JoinAnDIsAlive;

public class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread was created: " + name);
        t.start(); // start a new Thread
    }
    
    // Enter point in new Thread
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("InterruptedException in " + name + " Thread: " + e);
        }
        System.out.println(name + " Thread was over!");
    }
}
