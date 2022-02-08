package Runnable;

public class ThreadDemo {
    public static void main(String[] args){
        new NewThread(); // create a new Thread

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("Main Thread was Interrupted!");
        }
        System.out.println("Main Thread was over!");
    }
}
