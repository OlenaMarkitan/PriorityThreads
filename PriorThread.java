package com.marlen.java.lesson_1.Lesson7_1.Home7.Threads_potoki.Priority_Threads;

/**
 * Created by Pysik on 21.11.2016.
 */
public class PriorThread extends Thread {
    public PriorThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 71; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(100); // попробовать sleep(0),sleep(10)
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}