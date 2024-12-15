public class sleepmethod{
    public static void main(String args[]){
        System.out.println("Thread sstarte .---");
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            System.out.println("interupted");
        }
        System.out.println("Thread resumed");
    }
}
