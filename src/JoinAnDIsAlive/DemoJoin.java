package JoinAnDIsAlive;

public class DemoJoin {
    public static void main(String[] args){
        NewThread ob1 = new NewThread("First");
        System.out.println("Thread one is running: " + ob1.t.isAlive());

        NewThread ob2 = new NewThread("Second");
        System.out.println("Thread two is running: " + ob2.t.isAlive());

        NewThread ob3 = new NewThread("Third");
        System.out.println("Thread three is running: " + ob3.t.isAlive());

        // wait for the end of Thread
        try{
            System.out.println("Waiting for the end of all Threads!");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e){
            System.out.println("Main Thread was interrupted!");
        }

        System.out.println("Thread one is running: " + ob1.t.isAlive());
        System.out.println("Thread two is running: " + ob2.t.isAlive());
        System.out.println("Thread three is running: " + ob3.t.isAlive());

        System.out.println("Main Thread was over!");
    }
}
