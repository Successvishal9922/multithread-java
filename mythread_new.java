class C extends Thread{
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println("number : " + i);
        }
    }
}

class D extends Thread{
    public void run(){
        for (int i = 6; i <=10; i++) {
            System.out.println("value : " + i);
        }
    }
}

public class mythread_new {
    public static void main(String[]args)throws Exception{
        C a = new C();
        D b = new D();

        System.out.println("Happy...");
         a.start();
        try {
            a.join();//The join() method is used to make one thread wait until another thread completes its execution.
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
         b.start();
         System.out.println("Ending....");
        
    }
}

/*
🔥 How join() Works

When you write:

a.start();
a.join();
b.start();

What happens?

1️⃣ Thread A starts
2️⃣ Main thread waits at a.join()
3️⃣ When A finishes → main thread continues
4️⃣ Then B starts
*/

