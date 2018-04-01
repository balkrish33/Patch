package com.collection;
class VolatileExample extends Thread {
	boolean run = true;
 
    public void run() {
        while (run) {
        }
        System.out.println("Terminated.");
    }
 
    public static void main(String[] args) throws  	InterruptedException {
    	VolatileExample t = new VolatileExample();
        t.start();
        Thread.sleep(10);
        t.run = false;
        System.out.println("Should stop running now...");
    }
}