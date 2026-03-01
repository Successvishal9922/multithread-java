class mht1 extends Thread{
    public mht1(String name){
        super(name);
    }
    public void run(){
        System.out.println("hello "+getName());
    }

}
public class thread_priorities {
    public static void main(String[]args){

        mht1 m1=new mht1("vishal1");
        mht1 m2=new mht1("vishal2");
        mht1 m3=new mht1("vishal3");
        mht1 m4=new mht1("vishal4");
        //m4.setPriority(Thread.MAX_PRIORITY); this syntax aloso used for set priority
       // m4.setPriority(1);//seting the priority of object
        //m1.setPriority(Thread.MIN_PRIORITY);
        m1.setPriority(4);
        m4.setPriority(1);
        m3.setPriority(2);
        m2.setPriority(2);//this gives the most nearest priority
       // m3.setPriority(1);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
    
    
    }
    

