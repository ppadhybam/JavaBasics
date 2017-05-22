package com.basics.thread;

/**
 * Created by PriyabratP on 22-05-2017.
 *
 * - Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
 *
 * - Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by
 *   another thread and second thread is waiting for an object lock that is acquired by first thread
 */
public class ThreadDeadLock {

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
            synchronized (object2){
                System.out.println("Thread 2 holding object2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 waiting for object1");

                synchronized (object1){
                    System.out.println("Thread2 holding object1 & object2");
                }
            }
        }
    }
}




