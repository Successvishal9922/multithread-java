class mythread1 extends Thread{//multithread mins multiple work at a time// jas ki mobile bagne ani j1 karne
    public void run(){

    System.out.println("mythread class is running and doing study");
    }
}//  when we  using thread in inhertance then the class name is Thread
class mythread2 extends Thread{
    public void run(){
        
            System.out.println("mythread2 is running and doing chat with her");
    }
}

public class multithread_basic {
    public static void main(String[]args){
        mythread1 m= new mythread1();
        mythread2 m3 = new mythread2();
        m.start();
        m3.start();
    }
}
