class A implements Runnable{
    public void run(){
        for (int i = 1; i <= 50; i++) {
            System.out.println("number : " + i);
        }
    }
}

class B implements Runnable{
    public void run(){
        for (int i = 50; i <= 95; i++) {
            System.out.println("Value = " + i);
        }
    }
}

public class mythread_runnable {
    public static void main(String[]args) throws InterruptedException{
        A a = new A();
        Thread t1 = new Thread(a);

        B b = new B();
        Thread t2 = new Thread(b);

        System.out.println("Starting Thread 1....");
        t1.start();
        System.out.println("Happy Boss....");
        t1.join();
        System.out.println("Okkkkkk....");
        t2.start();
        System.out.println("End is the Beigining....");
    }
}
