package DeadLock;

public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();

    DeadLock(){
        Thread.currentThread().setName("Main Thread!");
        Thread t = new Thread(this, "Second Thread!");
        t.start();

        a.foo(b); // get block for object a in this Thread
        System.out.println("Back to Main Thread.");
    }

    public void run(){
        b.bar(a); // get block for object b in this Thread
        System.out.println("Back to another Thread.");
    }

    public static void main(String[] args){
        new DeadLock();
    }
}
