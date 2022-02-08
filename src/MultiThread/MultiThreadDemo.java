package MultiThread;

public class MultiThreadDemo {
    public static void main(String[] args){
        new NewThread("First Thread");
        new NewThread("Second Thread");
        new NewThread("Third Thread");

        // create a main Thread
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e){
            System.out.println("InterruptedException in Main Thread!");
        }
        System.out.println("Main Thread was over!");
    }
}
