package vcs.lt;

import java.util.Random;

public class CounterRunnable implements Runnable {

    private Counter counter = null;

    CounterRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int sum = 0;
        while (sum < 1000) {

        }

        for (int i = 0; i < 10; i++) {
            int randA = rand.nextInt((99 - 10) + 1) + 10;
            int randB = rand.nextInt((99 - 10) + 1) + 10;
            sum = randA + randB;
            counter.add(sum);
            System.out.println(Thread.currentThread().getName() + ": " + randA + " + " + randB + " = " + " " +  counter.getCount());
        }
    }
}
