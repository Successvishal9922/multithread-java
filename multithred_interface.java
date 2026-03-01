class mythread_runnableinterface1 implements Runnable{
    public void run(){
        System.out.println("i am thread1 ");
        System.out.println("i am thread1 ");
        System.out.println("i am thread1 ");
        System.out.println("i am thread1 ");
        System.out.println("i am thread1 ");
        System.out.println("i am thread1 ");
        System.out.println("i am thread1 ");
        System.out.println("i am thread1 ");

    }
}// using interfaces is in thread we use interface name is Runnable
class mythread_runnableinterface2 implements Runnable{
    public void run(){
        System.out.println("i am thread2");
        System.out.println("i am thread2");
        System.out.println("i am thread2");
        System.out.println("i am thread2");
        System.out.println("i am thread2");
        System.out.println("i am thread2");
        System.out.println("i am thread2");
    }
}


public class multithred_interface {
    public static void main(String[]args){
        mythread_runnableinterface1 r1= new mythread_runnableinterface1();
        Thread t=new Thread(r1);
        mythread_runnableinterface2 r2= new mythread_runnableinterface2();
        Thread t2=new Thread(r2);
        t.start();
        t2.start();
        System.out.println();
        System.out.println(" using run method ");
        System.out.println();
        r1.run();
        r2.run();
    }
}
