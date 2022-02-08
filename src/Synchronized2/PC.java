package Synchronized2;

public class PC {
    public static void main(String[] args){
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("For ending use --- CTR+C");
    }
}
