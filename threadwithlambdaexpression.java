public class threadwithlambdaexpression{
    public static void main(String args[]){
    Runnable r=()->System.out.println("iam new from java 8 version");
    Thread t=new Thread(r);
    t.start();
}
}