package Synchronized2;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while(!valueSet)
        try{
            wait();
        } catch(InterruptedException e){
            System.out.println("Interrupted Exception catched!");
        }

        System.out.println("Get: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n){
        while(valueSet)
            try{
                wait();
            } catch(InterruptedException e){
                System.out.println("Interrupted Exception catched!");
            }
        
        this.n = n;
        valueSet = true;
        System.out.println("Send: " + n);
        notify();
    }
}
