

public class Sleep_method extends Thread{

    public void run(){
        for (int i = 1; i < 61; i++) {
            System.out.println("Printing..." + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error : " + e.getMessage());
            }
        }
    }
    public static void main(String[]args){
        Sleep_method s = new Sleep_method();
        s.start();
    }
}
