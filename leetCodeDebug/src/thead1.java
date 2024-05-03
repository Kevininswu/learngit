import java.util.concurrent.Callable;

public class thead1 implements Callable {
    static Object lock =new Object();
    static  int grass =1;
    @Override
    public Object call() throws Exception {
         while (true){
             synchronized (lock){
                 Thread.sleep(10000);
                 if (grass<=10){

                         System.out.println(Thread.currentThread().getName()
                                 +"抢到第"+grass+"根萝卜");
                         grass++;

                     }else {
                     break;
                 }

                 }

             }

        return Thread.currentThread().getName();

    }
}
