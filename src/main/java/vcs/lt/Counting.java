package vcs.lt;

public class Counting {
    public static void main(String[] args){
        Counter counter = new Counter();
        new Thread(new CounterRunnable(counter), "Pirmas").start();
        new Thread(new CounterRunnable(counter), "Antras").start();
        new Thread(new CounterRunnable(counter), "Trecias").start();
    }
}
