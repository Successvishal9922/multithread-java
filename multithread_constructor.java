class consthread extends Thread{
    public consthread(String name){// here we useing constructor
        super (name);// here we used super keyword because we can change the thread name
    }
    public void run(){
        System.out.println("hi thread");
    }
}

public class multithread_constructor {
    public static void main(String[]args){
        consthread c= new consthread("vishal");
        c.start();//for run the thread we need to use start method
        //System.out.println("the id of the thread is  "+c.getId());
        System.out.println("the name of the thread is:-  "+c.getName());
        consthread c2= new consthread("Mahesh");
        c2.start();
        System.out.println("the name of second objact:- "+c2.getName());

    }
}
