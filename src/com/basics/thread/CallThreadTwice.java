package com.basics.thread;

/**
 * Created by PriyabratP on 22-05-2017.
 *
 * - Can we start a thread twice in Java?
 *      The answer is no, once a thread is started, it can never be started again.
 *      Doing so will throw an IllegalThreadStateException.
 */
public class CallThreadTwice {

    public static void main(String[] args){
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();
        anotherThread.start();
    }
}

class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Current thread is "+getName());
    }
}
