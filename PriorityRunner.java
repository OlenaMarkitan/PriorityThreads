package com.marlen.java.lesson_1.Lesson7_1.Home7.Threads_potoki.Priority_Threads;


/**
 * Created by Pysik on 21.11.2016.
 */
public class PriorityRunner {
    public static void main(String[ ] args) {
        PriorThread min = new PriorThread("Min");
        PriorThread max = new PriorThread("Max");
        PriorThread norm = new PriorThread("Norm");
        min.setPriority(Thread.MIN_PRIORITY); // 1
        max.setPriority(Thread.MAX_PRIORITY); // 10
        norm.setPriority(Thread.NORM_PRIORITY); // 5
        min.start();
        norm.start();
        max.start();
    }
}