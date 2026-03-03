class counter {
    int count = 0;
    public void increment(){
        count++;
        
    }
}

class Mythread5 extends Thread{
    counter c ;
    Mythread5(counter c){
        this.c = c;
    }
    public void run(){
        for (int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }

}

class Mythread6 extends Thread{
    counter c ;
    Mythread6(counter c){
        this.c = c;
    }
    public void run(){
        for (int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }

}
public class Race_condition  {
    public static void main(String[]args)throws InterruptedException{

        counter c = new counter();

        Mythread5 m1 = new Mythread5(c);
        Mythread6 m2 = new Mythread6(c);

        m1.start();
        m2.start();

        m1.join();
        m2.join();
        /*
        🧠 Small Timeline Visualization

            Without join:

            Main → print
            m1 → running
            m2 → running

            With join:

            Main → wait
            m1 → finish
            m2 → finish
            Main → print
        */

        System.out.println("final count : " + c.count);
    }
}
/*
Race condition occurs when multiple threads try to access or modifies the shared data
at the same time , leading to unexpected result 

i do this program to see what is race condition 

race contion ambiguty solved by synchronized method 
*/