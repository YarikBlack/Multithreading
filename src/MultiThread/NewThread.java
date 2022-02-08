package MultiThread;

public class NewThread implements Runnable {
    String name; // name of Thread

    Thread t;

    NewThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread created: " + name);
        t.start();
    }

    // Enter point for Thread
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("InterruptedException in (" + name + "): " + e);
        }
        System.out.println(name + " over!");
    }
}
