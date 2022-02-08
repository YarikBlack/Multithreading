package Synchronized;

class Synch{
    public static void main(String[] args){
        CallMe target = new CallMe();
        Caller objectOne = new Caller(target, "Welcome in");
        Caller objectTwo = new Caller(target, "world!");
        Caller objectThree = new Caller(target, "synchronized");

        // waiting for the end of all Threads
        try{
            objectOne.t.join();
            objectTwo.t.join();
            objectThree.t.join();
        } catch(InterruptedException e){
            System.out.println("Main Thread was Interrupted!");
        }
    }
}