package SuspendResume;

public class NewThread implements Runnable {
    String name; // name of Thread
    Thread t;
    boolean suspendFlag;

    NewThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread " + t);
        suspendFlag = false;
        t.start();
    }

    // Enter point in Thread
    public void run(){
        try{
            for(int i = 15; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized(this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        } catch(InterruptedException e){
            System.out.println("Thread was Interrupted!");
        }
        System.out.println(name + " over!");
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}
