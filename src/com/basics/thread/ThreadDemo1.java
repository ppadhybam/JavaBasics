package com.basics.thread;

/**
 * Created by PriyabratP on 22-05-2017.
 *
 * - A Thread can be created using two ways either extending Thread class or Implementing Runnable Interface.
 *
 * - If implements Runnable pass the object into Thread class constructor and call start method else if extends
 *    thread class call start() directly using its object.
 *
 * - Implements runnable is the most recommended because if you extend Thread there is no option of
 *    extending another class but if implements Runnable still there are a chance extending another class.
 */

public class ThreadDemo1 {

    public static void main(String[] args){

        Thread th1 = new ThreadOne();

        ThreadTwo threadTwo = new ThreadTwo();
        Thread th2 = new Thread(threadTwo);

        th1.start();
        th2.start();
    }
}


class ThreadOne extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("End of thread1");
        for(int i=0;i<10;i++)
        {
            System.out.println("In Thread 1 Value is "+i);
        }
        System.out.println("End of thread1");
    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("End of thread2");
        for(int i=0;i<10;i++)
        {
            System.out.println("In Thread 2 Value is "+i);
        }
        System.out.println("End of thread2");
    }
}
