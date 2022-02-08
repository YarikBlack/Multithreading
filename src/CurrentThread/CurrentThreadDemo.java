package CurrentThread;

class CurrentThreadDemo{
    public static void main(String[] args){
        Thread t = Thread.currentThread();

        System.out.println("Current Thread:  " +  t );
        
        // Rename current Thread
        t.setName("My Thread!");
        System.out.println("After change of name: " + t);

        try{
            for(int i = 5; i > 0; i--){
                System.out.println(i);
            }
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Main Thread was Interrupted!");
        }
    }
}