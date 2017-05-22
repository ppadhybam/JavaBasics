package com.basics.thread;

/**
 * Created by PriyabratP on 22-05-2017.
 *
 * - The join() method waits for a thread to die. In other words, it causes the currently running
 *      threads to stop executing until the thread it joins with completes its task.
 * -
 */
public class ThreadJoin {

    public static void main(String[] args){

        Thread th1 = new Thread(new ThreadWorker(),"thread1");
        Thread th2 = new Thread(new ThreadWorker(),"thread2");
        Thread th3 = new Thread(new ThreadWorker(),"thread3");

        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th2.start();
        try {
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th3.start();
        try {
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class ThreadWorker implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread started "+Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread ended "+Thread.currentThread().getName());
    }
}
