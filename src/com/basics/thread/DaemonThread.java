package com.basics.thread;

/**
 * Created by PriyabratP on 22-05-2017.
 *
 * - A thread is said to be Daemon if it runs in background contentiously without terminating.
 *
 * - The main purpose of this thread is that, it provides Service to other Threads.
 *
 * - Once task of all worker thread completes JVM will terminate this thread.
 *
 * - It is a low priority thread.
 *
 * - To make a thread Daemon call setDaemon() before start() else java.lang.IllegalThreadStateException will be thrown.
 *
 * - i.e. : gc
 */
public class DaemonThread {

    public static void main(String[] args){
        ThreadD thd = new ThreadD();
        thd.setDaemon(true);
        thd.start();
        boolean status = thd.isDaemon();
        System.out.println("Status is: "+status);
    }
}


class ThreadD extends Thread {

    ThreadD(){
        //setDaemon(true);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
