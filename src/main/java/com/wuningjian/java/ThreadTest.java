package com.wuningjian.java;

/**
 * Created by wu_ni on 2017/2/15.
 */
public class ThreadTest {
    //第一个测试Thread
    public static void ThreadStart(){
        for(int i = 0; i < 5; i++){
            new Thread(){
                public void run(){
                    System.out.println("Java first Thread");
                }
            }.start();
        }
        for(int i = 0; i < 5; i++){
            new Thread(){
                public void run(){
                    System.out.println("Java second Thread");
                }
            }.start();
        }
    }

    public class ThreadState implements Runnable {
        public synchronized void waitForASecond() throws InterruptedException{
            wait(500);
        }
        public synchronized void waitForYears() throws InterruptedException{
            wait();
        }
        public synchronized void notifyNow() throws InterruptedException{
            notify();
        }
        public void run(){
            try{
                waitForASecond();
                waitForYears();
            }catch(InterruptedException err){
                err.printStackTrace();
            }
        }
    }


    //测试Thread的状态显示，以及Runnable接口实现多线程
    public void ThreadState() throws InterruptedException{
        ThreadState state = new ThreadState();
        Thread thread = new Thread(state);
        System.out.println("新建线程"+thread.getState());
        thread.start();//线程启动
        Thread.sleep(100);//计时等待
        Thread.sleep(1000);//等待线程
        state.notifyNow();//唤醒线程
        Thread.sleep(1000);//终止线程


    }

}
