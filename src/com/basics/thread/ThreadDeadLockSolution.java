package com.basics.thread;

/**
 * Created by PriyabratP on 22-05-2017.
 *
 * - Solution for Deadlock: Lets keep the change of lock order same in all threads
 */
public class ThreadDeadLockSolution {

    public static String object1 = "Priyabrat";
    public static String object2 = "Satyabrat";

    public static void main(String[] args){

        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

        th1.start();
        th2.start();
    }


    static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (object1){
                System.out.println("Thread 1 holding object1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 waiting for object2");

                synchronized (object2){
                    System.out.println("Thread1 holding object1 & object2");
                }
            }
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (object1){
                System.out.println("Thread 2 holding object1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 waiting for object1");

                synchronized (object2){
                    System.out.println("Thread2 holding object1 & object2");
                }
            }
        }
    }
}
