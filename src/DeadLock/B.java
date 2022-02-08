package DeadLock;

public class B {
    
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered in method B.bar()");

        try{
            Thread.sleep(1000);
        } catch(Exception e){
            System.out.println("Class was Interrupt!");
        }

        System.out.println(name + " try to call method A.last()");
        a.last();
    }

    synchronized void last(){
        System.out.println("In method B.last()");
    }
}
