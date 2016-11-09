package net.cal.test;

public class MyThreadTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Th());
        Thread t2 = new Thread(new Th());
        Thread t3 = new Thread(new Th());
        Thread t4 = new Thread(new Th());
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class Th implements Runnable {
    private static int n = 0;

    @Override
    public synchronized void run() {
        synchronized (this.getClass()) {// this.getClass();
            for (int i = 0; i < 10; i++) {
                System.out.println(n++);
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
