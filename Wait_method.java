public class Wait_method {
    public static void main(String[]args)throws InterruptedException{
        String Name = "Vishal";
        synchronized(Name){
            Name.wait(5000);
            System.out.println("Resumed");
        }
    }
}
