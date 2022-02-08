package SuspendResume;

public class SuspendResume {
    public static void main(String[] args){
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Thread One was paused!");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Thread One was resumed!");
            ob2.mysuspend();
            System.out.println("Thread Two was paused!");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Thread Two was resumed!");
        } catch(InterruptedException e){
            System.out.println("Main Thread was Interrupted!");
        }

        // Wait for the end of all Thread
        try{
            System.out.println("Waiting for the end of all Threads!");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e){
            System.out.println("Main Thread was Interrupted!");
        }

        System.out.println("Main Thread was over!");
    }
}
