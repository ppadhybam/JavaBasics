package com.basics.thread;

/**
 * Created by PriyabratP on 22-05-2017.
 *
 * - If we call run() directly it will behave as a normal method and work on Main/UI/Current Thread rather than Worker Thread.
 *
 * - If we call start() JVM will call run() in a worker thread
 */
public class StartVsRun {

    public static void main(String[] args){

        Thread1 th1 = new Thread1();
        th1.setName("Thread 1");

        Thread2 th2 = new Thread2();
        th2.setName("Thread 2");

        th1.run();
        th2.start();
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
