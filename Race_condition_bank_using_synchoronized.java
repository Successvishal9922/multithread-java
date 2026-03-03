class BankAccount{
    int Balance = 50000;

    public synchronized void Withdrow(int Amount){
        if (Balance >= Amount) {
            Balance = Balance- Amount;
            System.out.println(Thread.currentThread().getName() + " withdrowing...." + Amount +  " Remaining Balance : " + Balance);
            
            
        } else {
            System.out.println(Thread.currentThread().getName() + " Insufficient fund....." + Amount +  " Remaining Balance : " + Balance);
        }
    }
}

class Customer extends Thread{
    BankAccount Acc;
    Customer (BankAccount Acc){
        this.Acc = Acc;
    } 

    public void run(){
        Acc.Withdrow(20000);
    }
}

public class Race_condition_bank_using_synchoronized {
     public static void main(String[]args)throws InterruptedException{
        BankAccount Acc = new BankAccount();

        Customer c1 = new Customer(Acc);
        Customer c2 = new Customer(Acc);
        Customer c3 = new Customer(Acc);
        

        c1.setName("vishal");
        c2.setName( "Vinod");
        c3.setName("keshav");

        c1.start();
        c1.join();
        c2.start();
        c2.join();
        c3.start();
        c3.join();

        
        
    }
}


